/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.simpleworkflow.model.*;

/**
 * Interface for accessing AmazonSimpleWorkflow.
 * Amazon Simple Workflow Service <p>
 * The Amazon Simple Workflow Service API Reference is intended for
 * programmers who need detailed information about the Amazon SWF actions
 * and data types.
 * </p>
 * <p>
 * For an broader overview of the Amazon SWF programming model, please
 * go to the
 * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/"> Amazon SWF Developer Guide </a>
 * .
 * </p>
 * <p>
 * This section provides an overview of Amazon SWF actions.
 * </p>
 * <p>
 * <b>Action Categories</b>
 * </p>
 * <p>
 * The Amazon SWF actions can be grouped into the following major
 * categories.
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Actions related to Activities
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Deciders
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Workflow Executions
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Administration
 * </p>
 * </li>
 * <li> <p>
 * Actions related to Visibility
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Actions related to Activities</b>
 * </p>
 * <p>
 * The following are actions that are performed by activity workers:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * PollForActivityTask
 * </p>
 * </li>
 * <li> <p>
 * RespondActivityTaskCompleted
 * </p>
 * </li>
 * <li> <p>
 * RespondActivityTaskFailed
 * </p>
 * </li>
 * <li> <p>
 * RespondActivityTaskCanceled
 * </p>
 * </li>
 * <li> <p>
 * RecordActivityTaskHeartbeat
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Activity workers use the PollForActivityTask to get new activity
 * tasks. After a worker receives an activity task from Amazon SWF, it
 * performs the task and responds using RespondActivityTaskCompleted if
 * successful or RespondActivityTaskFailed if unsuccessful.
 * </p>
 * <p>
 * <b>Actions related to Deciders</b>
 * </p>
 * <p>
 * The following are actions that are performed by deciders:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * PollForDecisionTask
 * </p>
 * </li>
 * <li> <p>
 * RespondDecisionTaskCompleted
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Deciders use PollForDecisionTask to get decision tasks. After a
 * decider receives a decision task from Amazon SWF, it examines its
 * workflow execution history and decides what to do next. It calls
 * RespondDecisionTaskCompletedto complete the decision task and provide
 * zero or more next decisions.
 * </p>
 * <p>
 * <b>Actions related to Workflow Executions</b>
 * </p>
 * <p>
 * The following actions operate on a workflow execution:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RequestCancelWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * StartWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * SignalWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * TerminateWorkflowExecution
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Actions related to Administration</b>
 * </p>
 * <p>
 * Although you can perform administrative tasks from the Amazon SWF
 * console, you can use the actions in this section to automate functions
 * or build your own administrative tools.
 * </p>
 * <p>
 * <b>Activity Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RegisterActivityType
 * </p>
 * </li>
 * <li> <p>
 * DeprecateActivityType
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RegisterWorkflowType
 * </p>
 * </li>
 * <li> <p>
 * DeprecateWorkflowType
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Domain Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RegisterDomain
 * </p>
 * </li>
 * <li> <p>
 * DeprecateDomain
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Execution Management</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * RequestCancelWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * TerminateWorkflowExecution
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Visibility Actions</b>
 * </p>
 * <p>
 * Although you can perform visibility actions from the Amazon SWF
 * console, you can use the actions in this section to build your own
 * console or administrative tools.
 * </p>
 * 
 * <ul>
 * 
 * </ul>
 * <p>
 * <b>Activity Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * ListActivityTypes
 * </p>
 * </li>
 * <li> <p>
 * DescribeActivity
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * ListWorkflowTypes
 * </p>
 * </li>
 * <li> <p>
 * DescribeWorkflowType
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Workflow Execution Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * DescribeWorkflowExecution
 * </p>
 * </li>
 * <li> <p>
 * ListOpenWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * ListClosedWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * CountOpenWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * CountClosedWorkflowExecutions
 * </p>
 * </li>
 * <li> <p>
 * GetWorkflowExecutionHistory
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Domain Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * ListDomains
 * </p>
 * </li>
 * <li> <p>
 * DescribeDomain
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Task List Visibility</b>
 * </p>
 * 
 * <ul>
 * <li> <p>
 * CountPendingActivityTasks
 * </p>
 * </li>
 * <li> <p>
 * CountPendingDecisionTasks
 * </p>
 * </li>
 * 
 * </ul>
 */
public interface AmazonSimpleWorkflow {

    /**
     * Overrides the default endpoint for this client ("https://swf.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "swf.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://swf.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "swf.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://swf.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonSimpleWorkflow#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Deprecates the specified <i>workflow type</i> . After a workflow type
     * has been deprecated, you cannot create new executions of that type.
     * Executions that were started before the type was deprecated will
     * continue to run. A deprecated workflow type may still be used when
     * calling visibility actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>workflowType.name</code> : String constraint. The key is
     * <code>swf:workflowType.name</code> .</li>
     * <li> <code>workflowType.version</code> : String constraint. The key
     * is <code>swf:workflowType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param deprecateWorkflowTypeRequest Container for the necessary
     *           parameters to execute the DeprecateWorkflowType service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws TypeDeprecatedException
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deprecateWorkflowType(DeprecateWorkflowTypeRequest deprecateWorkflowTypeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deprecates the specified domain. After a domain has been deprecated
     * it cannot be used to create new workflow executions or register new
     * types. However, you can still use visibility actions on this domain.
     * Deprecating a domain also deprecates all activity and workflow types
     * registered in the domain. Executions that were started before the
     * domain was deprecated will continue to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param deprecateDomainRequest Container for the necessary parameters
     *           to execute the DeprecateDomain service method on AmazonSimpleWorkflow.
     * 
     * 
     * @throws DomainDeprecatedException
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deprecateDomain(DeprecateDomainRequest deprecateDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a new <i>workflow type</i> and its configuration settings
     * in the specified domain.
     * </p>
     * <p>
     * The retention period for the workflow history is set by the
     * RegisterDomain action.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the type already exists, then a
     * TypeAlreadyExists fault is returned. You cannot change the
     * configuration settings of a workflow type once it is registered and it
     * must be registered as a new version.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>defaultTaskList</code> : String constraint. The key is
     * <code>swf:defaultTaskList.name</code> .</li>
     * <li> <code>name</code> : String constraint. The key is
     * <code>swf:name</code> .</li>
     * <li> <code>version</code> : String constraint. The key is
     * <code>swf:version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param registerWorkflowTypeRequest Container for the necessary
     *           parameters to execute the RegisterWorkflowType service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     * @throws TypeAlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void registerWorkflowType(RegisterWorkflowTypeRequest registerWorkflowTypeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about workflow types in the specified domain. The
     * results may be split into multiple pages that can be retrieved by
     * making the call repeatedly.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param listWorkflowTypesRequest Container for the necessary parameters
     *           to execute the ListWorkflowTypes service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the ListWorkflowTypes service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowTypeInfos listWorkflowTypes(ListWorkflowTypesRequest listWorkflowTypesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an execution of the workflow type in the specified domain
     * using the provided <code>workflowId</code> and input data.
     * </p>
     * <p>
     * This action returns the newly started workflow execution.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tagList.member.0</code> : The key is
     * <code>swf:tagList.member.0</code> .</li>
     * <li> <code>tagList.member.1</code> : The key is
     * <code>swf:tagList.member.1</code> .</li>
     * <li> <code>tagList.member.2</code> : The key is
     * <code>swf:tagList.member.2</code> .</li>
     * <li> <code>tagList.member.3</code> : The key is
     * <code>swf:tagList.member.3</code> .</li>
     * <li> <code>tagList.member.4</code> : The key is
     * <code>swf:tagList.member.4</code> .</li>
     * <li> <code>taskList</code> : String constraint. The key is
     * <code>swf:taskList.name</code> .</li>
     * <li> <code>name</code> : String constraint. The key is
     * <code>swf:workflowType.name</code> .</li>
     * <li> <code>version</code> : String constraint. The key is
     * <code>swf:workflowType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param startWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the StartWorkflowExecution service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the StartWorkflowExecution service method,
     *         as returned by AmazonSimpleWorkflow.
     * 
     * @throws TypeDeprecatedException
     * @throws OperationNotPermittedException
     * @throws DefaultUndefinedException
     * @throws UnknownResourceException
     * @throws WorkflowExecutionAlreadyStartedException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Run startWorkflowExecution(StartWorkflowExecutionRequest startWorkflowExecutionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Records a <code>WorkflowExecutionSignaled</code> event in the
     * workflow execution history and creates a decision task for the
     * workflow execution identified by the given domain, workflowId and
     * runId. The event is recorded with the specified user defined
     * signalName and input (if provided).
     * </p>
     * <p>
     * <b>NOTE:</b> If a runId is not specified, then the
     * WorkflowExecutionSignaled event is recorded in the history of the
     * current open workflow with the matching workflowId in the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> If the specified workflow execution is not open, this
     * method fails with UnknownResource.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param signalWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the SignalWorkflowExecution service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void signalWorkflowExecution(SignalWorkflowExecutionRequest signalWorkflowExecutionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the list of domains registered in the account. The results
     * may be split into multiple pages. To retrieve subsequent pages, make
     * the call again using the nextPageToken returned by the initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains. The element must be set to
     * <code>arn:aws:swf::AccountID:domain/*"</code> , where ???AccountID" is
     * the account ID, with no dashes.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param listDomainsRequest Container for the necessary parameters to
     *           execute the ListDomains service method on AmazonSimpleWorkflow.
     * 
     * @return The response from the ListDomains service method, as returned
     *         by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DomainInfos listDomains(ListDomainsRequest listDomainsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Records a <code>WorkflowExecutionCancelRequested</code> event in the
     * currently running workflow execution identified by the given domain,
     * workflowId, and runId. This logically requests the cancellation of the
     * workflow execution as a whole. It is up to the decider to take
     * appropriate actions when it receives an execution history with this
     * event.
     * </p>
     * <p>
     * <b>NOTE:</b> If the runId is not specified, the
     * WorkflowExecutionCancelRequested event is recorded in the history of
     * the current open workflow execution with the specified workflowId in
     * the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> Because this action allows the workflow to properly
     * clean up and gracefully close, it should be used instead of
     * TerminateWorkflowExecution when possible.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param requestCancelWorkflowExecutionRequest Container for the
     *           necessary parameters to execute the RequestCancelWorkflowExecution
     *           service method on AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void requestCancelWorkflowExecution(RequestCancelWorkflowExecutionRequest requestCancelWorkflowExecutionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the specified <i>workflow type</i> . This
     * includes configuration settings specified when the type was registered
     * and other information such as creation date, current status, etc.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>workflowType.name</code> : String constraint. The key is
     * <code>swf:workflowType.name</code> .</li>
     * <li> <code>workflowType.version</code> : String constraint. The key
     * is <code>swf:workflowType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param describeWorkflowTypeRequest Container for the necessary
     *           parameters to execute the DescribeWorkflowType service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the DescribeWorkflowType service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowTypeDetail describeWorkflowType(DescribeWorkflowTypeRequest describeWorkflowTypeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deprecates the specified <i>activity type</i> . After an activity
     * type has been deprecated, you cannot create new tasks of that activity
     * type. Tasks of this type that were scheduled before the type was
     * deprecated will continue to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>activityType.name</code> : String constraint. The key is
     * <code>swf:activityType.name</code> .</li>
     * <li> <code>activityType.version</code> : String constraint. The key
     * is <code>swf:activityType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param deprecateActivityTypeRequest Container for the necessary
     *           parameters to execute the DeprecateActivityType service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws TypeDeprecatedException
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deprecateActivityType(DeprecateActivityTypeRequest deprecateActivityTypeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the number of closed workflow executions within the given
     * domain that meet the specified filtering criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param countClosedWorkflowExecutionsRequest Container for the
     *           necessary parameters to execute the CountClosedWorkflowExecutions
     *           service method on AmazonSimpleWorkflow.
     * 
     * @return The response from the CountClosedWorkflowExecutions service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowExecutionCount countClosedWorkflowExecutions(CountClosedWorkflowExecutionsRequest countClosedWorkflowExecutionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the estimated number of activity tasks in the specified task
     * list. The count returned is an approximation and is not guaranteed to
     * be exact. If you specify a task list that no activity task was ever
     * scheduled in then 0 will be returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param countPendingActivityTasksRequest Container for the necessary
     *           parameters to execute the CountPendingActivityTasks service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the CountPendingActivityTasks service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PendingTaskCount countPendingActivityTasks(CountPendingActivityTasksRequest countPendingActivityTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Used by workers to tell the service that the ActivityTask identified
     * by the <code>taskToken</code> was successfully canceled. Additional
     * <code>details</code> can be optionally provided using the
     * <code>details</code> argument.
     * </p>
     * <p>
     * These <code>details</code> (if provided) appear in the
     * <code>ActivityTaskCanceled</code> event added to the workflow history.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Only use this operation if the canceled flag of a
     * RecordActivityTaskHeartbeat request returns true and if the activity
     * can be safely undone or abandoned.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it
     * is closed. Therefore a task is reported as open while a worker is
     * processing it. A task is closed after it has been specified in a call
     * to RespondActivityTaskCompleted, RespondActivityTaskCanceled,
     * RespondActivityTaskFailed, or the task has
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types"> timed out </a>
     * .
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param respondActivityTaskCanceledRequest Container for the necessary
     *           parameters to execute the RespondActivityTaskCanceled service method
     *           on AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void respondActivityTaskCanceled(RespondActivityTaskCanceledRequest respondActivityTaskCanceledRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Used by deciders to tell the service that the DecisionTask identified
     * by the <code>taskToken</code> has successfully completed. The
     * <code>decisions</code> argument specifies the list of decisions made
     * while processing the task.
     * </p>
     * <p>
     * A
     * <code>DecisionTaskCompleted</code> event is added
     * to the workflow history. The <code>executionContext</code> specified
     * is attached to the event in the workflow execution history.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * If an IAM policy grants permission to use
     * <code>RespondDecisionTaskCompleted</code> , it can express permissions
     * for the list of decisions in the <code>decisions</code> parameter in
     * the same way as for the regular API. This approach maintains a uniform
     * conceptual model and helps keep policies readable. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param respondDecisionTaskCompletedRequest Container for the necessary
     *           parameters to execute the RespondDecisionTaskCompleted service method
     *           on AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void respondDecisionTaskCompleted(RespondDecisionTaskCompletedRequest respondDecisionTaskCompletedRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Used by workers to tell the service that the ActivityTask identified
     * by the <code>taskToken</code> completed successfully with a
     * <code>result</code> (if provided). The <code>result</code> appears in
     * the <code>ActivityTaskCompleted</code> event in the workflow history.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the requested task does not complete
     * successfully, use RespondActivityTaskFailed instead. If the worker
     * finds that the task is canceled through the canceled flag returned by
     * RecordActivityTaskHeartbeat, it should cancel the task, clean up and
     * then call RespondActivityTaskCanceled.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it
     * is closed. Therefore a task is reported as open while a worker is
     * processing it. A task is closed after it has been specified in a call
     * to RespondActivityTaskCompleted, RespondActivityTaskCanceled,
     * RespondActivityTaskFailed, or the task has
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types"> timed out </a>
     * .
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param respondActivityTaskCompletedRequest Container for the necessary
     *           parameters to execute the RespondActivityTaskCompleted service method
     *           on AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void respondActivityTaskCompleted(RespondActivityTaskCompletedRequest respondActivityTaskCompletedRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Used by workers to get an ActivityTask from the specified activity
     * <code>taskList</code> . This initiates a long poll, where the service
     * holds the HTTP connection open and responds as soon as a task becomes
     * available. The maximum time the service holds on to the request before
     * responding is 60 seconds. If no task is available within 60 seconds,
     * the poll will return an empty result. An empty result, in this
     * context, means that an ActivityTask is returned, but that the value of
     * taskToken is an empty string. If a task is returned, the worker should
     * use its type to identify and process it correctly.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Workers should set their client side socket timeout
     * to at least 70 seconds (10 seconds higher than the maximum time
     * service may hold the poll request).
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param pollForActivityTaskRequest Container for the necessary
     *           parameters to execute the PollForActivityTask service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the PollForActivityTask service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ActivityTask pollForActivityTask(PollForActivityTaskRequest pollForActivityTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the number of open workflow executions within the given
     * domain that meet the specified filtering criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param countOpenWorkflowExecutionsRequest Container for the necessary
     *           parameters to execute the CountOpenWorkflowExecutions service method
     *           on AmazonSimpleWorkflow.
     * 
     * @return The response from the CountOpenWorkflowExecutions service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowExecutionCount countOpenWorkflowExecutions(CountOpenWorkflowExecutionsRequest countOpenWorkflowExecutionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the specified activity type. This includes
     * configuration settings provided at registration time as well as other
     * general information about the type.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>activityType.name</code> : String constraint. The key is
     * <code>swf:activityType.name</code> .</li>
     * <li> <code>activityType.version</code> : String constraint. The key
     * is <code>swf:activityType.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param describeActivityTypeRequest Container for the necessary
     *           parameters to execute the DescribeActivityType service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the DescribeActivityType service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ActivityTypeDetail describeActivityType(DescribeActivityTypeRequest describeActivityTypeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of open workflow executions in the specified domain
     * that meet the filtering criteria. The results may be split into
     * multiple pages. To retrieve subsequent pages, make the call again
     * using the nextPageToken returned by the initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param listOpenWorkflowExecutionsRequest Container for the necessary
     *           parameters to execute the ListOpenWorkflowExecutions service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the ListOpenWorkflowExecutions service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowExecutionInfos listOpenWorkflowExecutions(ListOpenWorkflowExecutionsRequest listOpenWorkflowExecutionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the history of the specified workflow execution. The results
     * may be split into multiple pages. To retrieve subsequent pages, make
     * the call again using the <code>nextPageToken</code> returned by the
     * initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param getWorkflowExecutionHistoryRequest Container for the necessary
     *           parameters to execute the GetWorkflowExecutionHistory service method
     *           on AmazonSimpleWorkflow.
     * 
     * @return The response from the GetWorkflowExecutionHistory service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public History getWorkflowExecutionHistory(GetWorkflowExecutionHistoryRequest getWorkflowExecutionHistoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a new domain.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>You cannot use an IAM policy to control domain access for this
     * action. The name of the domain being registered is available as the
     * resource of this action.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     * <p>
     * 
     * </p>
     *
     * @param registerDomainRequest Container for the necessary parameters to
     *           execute the RegisterDomain service method on AmazonSimpleWorkflow.
     * 
     * 
     * @throws DomainAlreadyExistsException
     * @throws OperationNotPermittedException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void registerDomain(RegisterDomainRequest registerDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers a new <i>activity type</i> along with its configuration
     * settings in the specified domain.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> A TypeAlreadyExists fault is returned if the type
     * already exists in the domain. You cannot change any configuration
     * settings of the type after its registration, and it must be registered
     * as a new version.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>defaultTaskList</code> : String constraint. The key is
     * <code>swf:defaultTaskList.name</code> .</li>
     * <li> <code>name</code> : String constraint. The key is
     * <code>swf:name</code> .</li>
     * <li> <code>version</code> : String constraint. The key is
     * <code>swf:version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param registerActivityTypeRequest Container for the necessary
     *           parameters to execute the RegisterActivityType service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     * @throws TypeAlreadyExistsException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void registerActivityType(RegisterActivityTypeRequest registerActivityTypeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of closed workflow executions in the specified domain
     * that meet the filtering criteria. The results may be split into
     * multiple pages. To retrieve subsequent pages, make the call again
     * using the nextPageToken returned by the initial call.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Constrain the following parameters by using a
     * <code>Condition</code> element with the appropriate keys.
     * <ul>
     * <li> <code>tag</code> : String constraint. The key is
     * <code>swf:tagFilter.tag</code> .</li>
     * <li> <code>typeFilter.name</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.name</code> .</li>
     * <li> <code>typeFilter.version</code> : String constraint. String
     * constraint. The key is <code>swf:typeFilter.version</code> .</li>
     * 
     * </ul>
     * </li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param listClosedWorkflowExecutionsRequest Container for the necessary
     *           parameters to execute the ListClosedWorkflowExecutions service method
     *           on AmazonSimpleWorkflow.
     * 
     * @return The response from the ListClosedWorkflowExecutions service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowExecutionInfos listClosedWorkflowExecutions(ListClosedWorkflowExecutionsRequest listClosedWorkflowExecutionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Used by activity workers to report to the service that the
     * ActivityTask represented by the specified <code>taskToken</code> is
     * still making progress. The worker can also (optionally) specify
     * details of the progress, for example percent complete, using the
     * <code>details</code> parameter. This action can also be used by the
     * worker as a mechanism to check if cancellation is being requested for
     * the activity task. If a cancellation is being attempted for the
     * specified task, then the boolean <code>cancelRequested</code> flag
     * returned by the service is set to <code>true</code> .
     * </p>
     * <p>
     * This action resets the <code>taskHeartbeatTimeout</code> clock. The
     * <code>taskHeartbeatTimeout</code> is specified in
     * RegisterActivityType.
     * </p>
     * <p>
     * This action does not in itself create an event in the workflow
     * execution history. However, if the task times out, the workflow
     * execution history will contain a <code>ActivityTaskTimedOut</code>
     * event that contains the information from the last heartbeat generated
     * by the activity worker.
     * </p>
     * <p>
     * <b>NOTE:</b> The taskStartToCloseTimeout of an activity type is the
     * maximum duration of an activity task, regardless of the number of
     * RecordActivityTaskHeartbeat requests received. The
     * taskStartToCloseTimeout is also specified in RegisterActivityType.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is only useful for long-lived activities
     * to report liveliness of the task and to determine if a cancellation is
     * being attempted.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the cancelRequested flag returns true, a
     * cancellation is being attempted. If the worker can cancel the
     * activity, it should respond with RespondActivityTaskCanceled.
     * Otherwise, it should ignore the cancellation request.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param recordActivityTaskHeartbeatRequest Container for the necessary
     *           parameters to execute the RecordActivityTaskHeartbeat service method
     *           on AmazonSimpleWorkflow.
     * 
     * @return The response from the RecordActivityTaskHeartbeat service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ActivityTaskStatus recordActivityTaskHeartbeat(RecordActivityTaskHeartbeatRequest recordActivityTaskHeartbeatRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Used by deciders to get a DecisionTask from the specified decision
     * <code>taskList</code> . A decision task may be returned for any open
     * workflow execution that is using the specified task list. The task
     * includes a paginated view of the history of the workflow execution.
     * The decider should use the workflow type and the history to determine
     * how to properly handle the task.
     * </p>
     * <p>
     * This action initiates a long poll, where the service holds the HTTP
     * connection open and responds as soon a task becomes available. If no
     * decision task is available in the specified task list before the
     * timeout of 60 seconds expires, an empty result is returned. An empty
     * result, in this context, means that a DecisionTask is returned, but
     * that the value of taskToken is an empty string.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Deciders should set their client side socket
     * timeout to at least 70 seconds (10 seconds higher than the timeout).
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Because the number of workflow history events for a
     * single workflow execution might be very large, the result returned
     * might be split up across a number of pages. To retrieve subsequent
     * pages, make additional calls to PollForDecisionTask using the
     * nextPageToken returned by the initial call. Note that you do not call
     * GetWorkflowExecutionHistory with this nextPageToken. Instead, call
     * PollForDecisionTask again.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param pollForDecisionTaskRequest Container for the necessary
     *           parameters to execute the PollForDecisionTask service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the PollForDecisionTask service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     * @throws LimitExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DecisionTask pollForDecisionTask(PollForDecisionTaskRequest pollForDecisionTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about all activities registered in the specified
     * domain that match the specified name and registration status. The
     * result includes information like creation date, current status of the
     * activity, etc. The results may be split into multiple pages. To
     * retrieve subsequent pages, make the call again using the
     * <code>nextPageToken</code> returned by the initial call.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param listActivityTypesRequest Container for the necessary parameters
     *           to execute the ListActivityTypes service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the ListActivityTypes service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ActivityTypeInfos listActivityTypes(ListActivityTypesRequest listActivityTypesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the specified domain including description
     * and status.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param describeDomainRequest Container for the necessary parameters to
     *           execute the DescribeDomain service method on AmazonSimpleWorkflow.
     * 
     * @return The response from the DescribeDomain service method, as
     *         returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DomainDetail describeDomain(DescribeDomainRequest describeDomainRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Used by workers to tell the service that the ActivityTask identified
     * by the <code>taskToken</code> has failed with <code>reason</code> (if
     * specified). The <code>reason</code> and <code>details</code> appear in
     * the <code>ActivityTaskFailed</code> event added to the workflow
     * history.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it
     * is closed. Therefore a task is reported as open while a worker is
     * processing it. A task is closed after it has been specified in a call
     * to RespondActivityTaskCompleted, RespondActivityTaskCanceled,
     * RespondActivityTaskFailed, or the task has
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types"> timed out </a>
     * .
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param respondActivityTaskFailedRequest Container for the necessary
     *           parameters to execute the RespondActivityTaskFailed service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void respondActivityTaskFailed(RespondActivityTaskFailedRequest respondActivityTaskFailedRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the estimated number of decision tasks in the specified task
     * list. The count returned is an approximation and is not guaranteed to
     * be exact. If you specify a task list that no decision task was ever
     * scheduled in then 0 will be returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>Use a <b>Condition</b> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only
     * certain task lists.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param countPendingDecisionTasksRequest Container for the necessary
     *           parameters to execute the CountPendingDecisionTasks service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the CountPendingDecisionTasks service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PendingTaskCount countPendingDecisionTasks(CountPendingDecisionTasksRequest countPendingDecisionTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Records a <code>WorkflowExecutionTerminated</code> event and forces
     * closure of the workflow execution identified by the given domain,
     * runId, and workflowId. The child policy, registered with the workflow
     * type or specified when starting this execution, is applied to any open
     * child workflow executions of this workflow execution.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> If the identified workflow execution was in
     * progress, it is terminated immediately.
     * </p>
     * <p>
     * <b>NOTE:</b> If a runId is not specified, then the
     * WorkflowExecutionTerminated event is recorded in the history of the
     * current open workflow with the matching workflowId in the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> You should consider using RequestCancelWorkflowExecution
     * action instead because it allows the workflow to gracefully close
     * while TerminateWorkflowExecution does not.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param terminateWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the TerminateWorkflowExecution service method on
     *           AmazonSimpleWorkflow.
     * 
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void terminateWorkflowExecution(TerminateWorkflowExecutionRequest terminateWorkflowExecutionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns information about the specified workflow execution including
     * its type and some statistics.
     * </p>
     * <p>
     * <b>NOTE:</b> This operation is eventually consistent. The results are
     * best effort and may not exactly reflect recent updates and changes.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon
     * SWF resources as follows:
     * </p>
     * 
     * <ul>
     * <li>Use a <code>Resource</code> element with the domain name to limit
     * the action to only specified domains.</li>
     * <li>Use an <code>Action</code> element to allow or deny permission to
     * call this action.</li>
     * <li>You cannot use an IAM policy to constrain this action's
     * parameters.</li>
     * 
     * </ul>
     * <p>
     * If the caller does not have sufficient permissions to invoke the
     * action, or the parameter values fall outside the specified
     * constraints, the action fails by throwing
     * <code>OperationNotPermitted</code> . For details and example IAM
     * policies, see
     * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
     * .
     * </p>
     *
     * @param describeWorkflowExecutionRequest Container for the necessary
     *           parameters to execute the DescribeWorkflowExecution service method on
     *           AmazonSimpleWorkflow.
     * 
     * @return The response from the DescribeWorkflowExecution service
     *         method, as returned by AmazonSimpleWorkflow.
     * 
     * @throws OperationNotPermittedException
     * @throws UnknownResourceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonSimpleWorkflow indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public WorkflowExecutionDetail describeWorkflowExecution(DescribeWorkflowExecutionRequest describeWorkflowExecutionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        