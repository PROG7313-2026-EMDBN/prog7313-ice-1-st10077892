📱 Developer Toolkit App
📝 Overview

The Developer Toolkit App is an Android application built using Kotlin and Jetpack Compose.
It is designed to help developers store and access useful information and resources while learning or working in Android development.

This app was developed as part of an academic activity to gain hands-on experience with Android Studio, app structure, and basic state management without using a database.

🎯 Objectives

The main goals of this project are to:

Understand Android app structure and navigation

Work with Jetpack Compose UI

Apply basic modelling using Kotlin data classes

Use in-memory data storage

Practice clean project organisation and GitHub usage

⚙️ Features
🖥 Device Information

Displays basic information about the current device, including:

Android Version

SDK Level

Device Model

📝 Developer Notes

Allows developers to:

View developer notes

Store short notes related to development concepts

Manage notes using temporary (in-memory) data

🔗 Developer Links Manager

Allows developers to:

Save useful development links

Assign each link a category

View and manage saved links

Supported categories include:

Documentation

Tutorials

Tools

GitHub Repositories

Q&A / Stack Overflow




💾 Data Storage

At this stage, the app uses in-memory storage via a SampleData object.
No database or Firebase is used, as per the activity requirements.

This approach allows:

Faster development

Focus on functionality

Easy migration to a database in future iterations

🚀 Technologies Used

Kotlin

Jetpack Compose

Material 3

Android Studio

Git & GitHub

🔮 Future Improvements

Possible enhancements include:

Persisting data using Room or Firebase

Adding edit functionality for notes and links

Opening saved links in the device browser

Improving UI and accessibility

Implementing ViewModels fully for state management

🧠 Reflection

This project helped reinforce the importance of:

Structuring applications properly

Separating UI, data, and logic

Categorising information for usability

Building scalable applications that can grow over time
