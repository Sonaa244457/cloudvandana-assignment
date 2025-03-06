// Get DOM elements
const taskInput = document.getElementById('taskInput');
const addTaskButton = document.getElementById('addTask');
const taskList = document.getElementById('taskList');

// Load tasks from localStorage
let tasks = JSON.parse(localStorage.getItem('tasks')) || [];

// Function to save tasks to localStorage
function saveTasks() {
    localStorage.setItem('tasks', JSON.stringify(tasks));
}

// Function to create a new task element
function createTaskElement(task) {
    const li = document.createElement('li');
    li.className = 'task-item';
    
    const taskText = document.createElement('span');
    taskText.textContent = task;
    
    const deleteButton = document.createElement('button');
    deleteButton.className = 'delete-btn';
    deleteButton.textContent = 'Delete';
    
    // Add delete functionality
    deleteButton.addEventListener('click', () => {
        const index = tasks.indexOf(task);
        if (index > -1) {
            tasks.splice(index, 1);
            saveTasks();
            li.remove();
        }
    });
    
    li.appendChild(taskText);
    li.appendChild(deleteButton);
    return li;
}

// Function to render all tasks
function renderTasks() {
    taskList.innerHTML = '';
    tasks.forEach(task => {
        taskList.appendChild(createTaskElement(task));
    });
}

// Function to add a new task
function addTask() {
    const taskText = taskInput.value.trim();
    
    if (taskText) {
        tasks.push(taskText);
        saveTasks();
        taskList.appendChild(createTaskElement(taskText));
        taskInput.value = '';
    }
}

// Event listeners
addTaskButton.addEventListener('click', addTask);
taskInput.addEventListener('keypress', (e) => {
    if (e.key === 'Enter') {
        addTask();
    }
});

// Initial render
renderTasks(); 