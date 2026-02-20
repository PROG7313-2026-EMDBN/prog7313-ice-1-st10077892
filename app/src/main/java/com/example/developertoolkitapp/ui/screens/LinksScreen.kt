package com.example.developertoolkitapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.developertoolkitapp.model.DeveloperLink
import com.example.developertoolkitapp.model.LinkCategory


@Composable
fun LinksScreen() {
    var title by remember { mutableStateOf("") }
    var url by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf(LinkCategory.DOCUMENTATION) }

    val links = remember { mutableStateListOf<DeveloperLink>() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Developer Links", style = MaterialTheme.typography.headlineMedium)

        Spacer(Modifier.height(12.dp))

        OutlinedTextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Title") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(8.dp))

        OutlinedTextField(
            value = url,
            onValueChange = { url = it },
            label = { Text("URL") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(8.dp))

        DropdownMenuBox(
            selectedCategory = selectedCategory,
            onCategorySelected = { selectedCategory = it }
        )

        Spacer(Modifier.height(8.dp))

        Button(
            onClick = {
                if (title.isNotBlank() && url.isNotBlank()) {
                    links.add(
                        DeveloperLink(title, url, selectedCategory)
                    )
                    title = ""
                    url = ""
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Add Link")
        }

        Spacer(Modifier.height(16.dp))

        LazyColumn {
            items(links) { link ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {
                    Column(Modifier.padding(12.dp)) {
                        Text(link.title, style = MaterialTheme.typography.titleMedium)
                        Text(link.url)
                        Text("Category: ${link.category}")
                    }
                }
            }
        }
    }

}

@Composable
fun DropdownMenuBox(
    selectedCategory: LinkCategory,
    onCategorySelected: (LinkCategory) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Box {
        OutlinedButton(onClick = { expanded = true }) {
            Text(selectedCategory.name)
        }

        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            LinkCategory.values().forEach {
                DropdownMenuItem(
                    text = { Text(it.name) },
                    onClick = {
                        onCategorySelected(it)
                        expanded = false
                    }
                )
            }
        }
    }
}



