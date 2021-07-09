package com.example.secretProject.expandableRecyclerView

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup

class GroupListDto(
    var categoryGroup: String,
    var servicesGroup: List<ChoiceListDto>,
) : ExpandableGroup<ChoiceListDto>(category, services)