package com.example.developertoolkitapp.model

object SampleData {

    // 📝 Sample Developer Notes
    val notes = mutableListOf(
        DeveloperNote(
            title = "Jetpack Compose",
            content = "Remember: Composables must start with a capital letter.",
            text = TODO()
        ),
        DeveloperNote(

            content = "NavHost manages app navigation in Compose.",
            text = TODO(),
            title = TODO(),
        )
    )

    // 🔗 Sample Developer Links
    val links = mutableListOf(
        DeveloperLink(
            title = "Android Docs",
            url = "https://developer.android.com",
            category = LinkCategory.DOCUMENTATION
        ),
        DeveloperLink(
            title = "Compose Tutorial",
            url = "https://developer.android.com/jetpack/compose/tutorial",
            category = LinkCategory.TUTORIALS
        ),
        DeveloperLink(
            title = "Stack Overflow",
            url = "https://stackoverflow.com",
            category = LinkCategory.QA
        )
    )

    // 📂 Categories reference
    val categories = LinkCategory.entries
}