# android-activities-demo


This is android demo project illustrating the concept of Activities and their type with respect to backstack.
#official Docs
There are four modes that work in conjunction with activity flags (FLAG_ACTIVITY_* constants) in Intent objects to determine what should happen when the activity is called upon to handle an intent. They are:
"standard" 
"singleTop" 
"singleTask" 
"singleInstance"

The default mode is "standard".

As shown in the table below, the modes fall into two main groups, with "standard" and "singleTop" activities on one side, and "singleTask" and "singleInstance" activities on the other. An activity with the "standard" or "singleTop" launch mode can be instantiated multiple times. The instances can belong to any task and can be located anywhere in the activity stack. Typically, they're launched into the task that called startActivity() (unless the Intent object contains a FLAG_ACTIVITY_NEW_TASK instruction, in which case a different task is chosen — see the taskAffinity attribute).

In contrast, "singleTask" and "singleInstance" activities can only begin a task. They are always at the root of the activity stack. Moreover, the device can hold only one instance of the activity at a time — only one such task.

The "standard" and "singleTop" modes differ from each other in just one respect: Every time there's a new intent for a "standard" activity, a new instance of the class is created to respond to that intent. Each instance handles a single intent. Similarly, a new instance of a "singleTop" activity may also be created to handle a new intent. However, if the target task already has an existing instance of the activity at the top of its stack, that instance will receive the new intent (in an onNewIntent() call); a new instance is not created. In other circumstances — for example, if an existing instance of the "singleTop" activity is in the target task, but not at the top of the stack, or if it's at the top of a stack, but not in the target task — a new instance would be created and pushed on the stack.

Similarly, if you navigate up to an activity on the current stack, the behavior is determined by the parent activity's launch mode. If the parent activity has launch mode singleTop (or the up intent contains FLAG_ACTIVITY_CLEAR_TOP), the parent is brought to the top of the stack, and its state is preserved. The navigation intent is received by the parent activity's onNewIntent() method. If the parent activity has launch mode standard (and the up intent does not contain FLAG_ACTIVITY_CLEAR_TOP), the current activity and its parent are both popped off the stack, and a new instance of the parent activity is created to receive the navigation intent.

The "singleTask" and "singleInstance" modes also differ from each other in only one respect: A "singleTask" activity allows other activities to be part of its task. It's always at the root of its task, but other activities (necessarily "standard" and "singleTop" activities) can be launched into that task. A "singleInstance" activity, on the other hand, permits no other activities to be part of its task. It's the only activity in the task. If it starts another activity, that activity is assigned to a different task — as if FLAG_ACTIVITY_NEW_TASK was in the intent.

