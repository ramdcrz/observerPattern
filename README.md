# observerPattern
<b>Real-time News Subscription Service</b>

<p><b>Background:</b>
  You are tasked with designing a real-time news subscription service for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency. The system relies on decoupled communication, where subscribers do not request updates directly but are automatically notified when new information is available.</p>

<p><b>Scenario Description:</b>
  The system comprises two main components: NewsAgency and Subscriber.</p>
<ul>
  <li><b>NewsAgency:</b> Represents the central hub for publishing news. It maintains a list of subscribers and notifies them whenever new news is available.</li>
  <li><b>Subscriber:</b> Represents users or entities subscribed to the news service. Subscribers receive immediate notifications about any breaking news published by the agency.</li>
</ul>

<p><b>Requirements:</b>
<ol>
  <li><b>Subscription Management:</b>
    <ul>
      <li>Users should be able to subscribe to the news service.</li>
      <li>Subscribers should be notified promptly when new news is published.</li>
    </ul>
  </li>
  
  <li><b>Dynamic Subscription Updates:</b>
    <ul>
      <li>The system should allow for dynamic subscription updates. Subscribers can subscribe, unsubscribe, or modify their preferences without disrupting other subscribers.</li>
    </ul>
  </li>

  <li><b>Decoupled Communication:</b>
    <ul>
      <li>Ensure that the communication between the news agency and subscribers is decoupled. Subscribers shouldn't directly request news updates but should be notified by the news agency when new information is available.</li>
    </ul>
  </li>
</ol>

<p><b>Expected Behavior:</b>
<ul>
  <li>When the news agency publishes breaking news, all subscribed users should receive immediate updates.</li>
  <li>Subscribers can join or leave the service without affecting the delivery of news to other subscribers.</li>
  <li>The system should provide flexibility for future enhancements, such as personalized subscriptions or categorization of news updates.</li>
</ul>

<p><b>Constraints:</b>
<ul>
  <li>The system should be scalable to handle a growing number of subscribers without compromising performance.</li>
  <li>Ensure that the implementation follows object-oriented design principles and promotes loose coupling between the news agency and subscribers.</li>
</ul>

## UML Diagram
![alt text](https://github.com/ramdcrz/observerPattern/blob/main/observerPattern_UML.png?raw=true)
