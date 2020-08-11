package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class AgentServicesImpl implements AgentServices
{

    @Autowired
    AgentsRepository agentrepos;

}
