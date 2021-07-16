package com.intexsoft.project.commands.client.crud;

import com.intexsoft.project.commands.Command;
import com.intexsoft.project.entities.Client;
import com.intexsoft.project.services.ClientService;
import com.intexsoft.project.utils.ConsoleHelper;
import java.util.List;

public class DeleteClientCommand implements Command {
    private final ConsoleHelper consoleHelper;
    private final ClientService clientService;

    public DeleteClientCommand(ConsoleHelper consoleHelper, ClientService clientService) {
        this.consoleHelper = consoleHelper;
        this.clientService = clientService;
    }

    private Client getClientToDelete(List<Client> clients) {
        int choice = consoleHelper.validateIntToValue(clients.size());
        return clients.get(choice - 1);
    }

    @Override
    public String name() {
        return "Delete Client";
    }

    @Override
    public void execute() {
        List<Client> clients = clientService.getEntities();
        consoleHelper.show(clients);

        System.out.println("Input client to delete:");
        Client client = getClientToDelete(clients);

        clientService.deleteEntity(client);
    }
}