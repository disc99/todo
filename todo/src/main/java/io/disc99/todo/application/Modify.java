package io.disc99.todo.application;

import io.disc99.archetype.Command;
import io.disc99.todo.domain.Doing;
import io.disc99.todo.domain.Identify;

public class Modify implements Command {
    private Identify identify;
    private Doing doing;
}