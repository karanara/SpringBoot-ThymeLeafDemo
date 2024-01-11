# thymeleafdemo

ThymeLeaf-- Java templating Engine
ThymeLeaf Template--Can be an HTML page with some Thymeleaf expressions
@Controller 
   Model m,  m.addAttribute ("theDate",data) -- adds data to the html view page
   Thymeleaf template files will go in template folder under resource section
Spring MVC:
   A set of webpages to layout UI component
   collection of spring beans such as controller,services
   configuration such as pom.xml and java annotations.

   
   Spring MVC Front Controller :
       Front controller known as Dispatcher Servlet.
       Model --- contains our data[container]
                 Store/retrieve data via backend systems
                 Place our data in the model   
       View--- Spring MVC is flexible 
               Supports many view templates
               Recommended: Thymeleaf
               Developer creates a page and Displays data
       Controller---handles the request
                    stores data/retrive the data
                    place data in model
                    sends to appropiate view template.

                    
Spring MVC is also used for databinding
       we have to use model atrribute which is a type of bean that will hold form data used for data binding.
       When form is loaded,Spring MVC will read student from the model, then calls get methods.
      When form is submitted, Spring MVC will create a new Student instance and add to the model, then calls setter methods.
      we retreive data to controller using @ModelAttribute .

      Also supports Spring MVC validation with many attributes and can have custom validation.
                    
