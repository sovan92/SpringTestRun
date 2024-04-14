### SpringBean Life Cycle. 

- Instantiate
- Populate properties
- call setBeanName of BeanNameAware
- call setBeanFactory of beanFactoryAware
- call setApplicationContextOfApplicationContextAware
- PreIntilization (BeanPostProcessor)
- afterPropertiesSet of InitalizingBeans
- customInit method. 
- BeanPost Processor. 
- Bean ready to use - (Not a method)


### LifeCycle of Bean Terminated

- Can annotate a method which runs when the bean shutdown. 
- @PreDestroy
- destroy()
- Terminated.

### Spring has two interfaces which you can implement for call back event. 

- InitializingBean 
  - afterpropertiesSet()

- DisposibleBean.destroy()
  - Called after destruction in shutdown . 

- @PostContruct
  - 

- @PreDestroy
  - 
- Bean Post proc

### BeanPostProcessor

- postProcessBeanIntitlialization
- postProcessAfterInitialization

Spring has 14 Bean aware interface. 

- ApplicationContextAware