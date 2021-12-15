# SpringSoapWebservice

#public @interface RequestPayload
Annotation which indicates that a method parameter should be bound to the request payload. Supported for annotated endpoint methods.
In simple language this annotation will help to take  xml request and map to  java object

#public @interface PayloadRoot
Marks an endpoint method as the handler for an incoming request. The annotation values signify the the request payload root element that is handled by the method.
payloadroot tells webservice we have to process this namespace with this request
