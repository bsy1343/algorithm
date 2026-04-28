# [Silver I] Message Routing - 6478

[문제 링크](https://www.acmicpc.net/problem/6478)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

구현, 그래프 이론, 시뮬레이션

### 문제 설명

<p>The International Standards Organization has defined a Message Handling System (MHS) called X.400. &nbsp;One of the functional units of a MHS, the MTA, handles routing of messages. &nbsp;Routing is performed based on components of the Originator/Recipient name. &nbsp;For the purposes of this problem, valid components of an O/R name (in order of widest scope to narrowest scope) are Country (C), Administrative Management Domain (ADMD), Private Management Domain (PRMD), and Organization Name (O). &nbsp;Each MTA uses its own routing table to forward messages on to the next MTA or delivering the message locally.&nbsp;</p>

<p>Your program is to simulate a collection of MTAs processing messages. &nbsp;Each time a message arrives (or is submitted) to an MTA, the MTA uses the O/R name of the message and the MTA&#39;s routing table to forward the message on to the appropriate MTA. &nbsp;If the MTA finds that the message&#39;s final destination is itself, it will deliver the message locally. &nbsp;Your program is to simulate this message-forwarding activity to trace the path of mail through the set of MTAs.&nbsp;</p>

<p>The routing function is accomplished by comparing the supplied fields of entries in the routing table against the O/R name components of the message. &nbsp;Each routing table entry refers to exactly one MTA although &nbsp;MTAs may have multiple entries in the routing table. &nbsp;The first routing table entry (starting from the top) whose fields match the corresponding O/R name components in the message is selected and the message is forwarded to that MTA. &nbsp;It is possible for routing table entries to contain a wildcard (denoted by an asterisk); wildcard components always match the contents of the corresponding O/R name component in the message.&nbsp;</p>

<p>MTAs are also responsible for routing error detection and recovery. &nbsp;If an MTA detects that it has received a message that it has handled before (a circular routing path is detected), it will place the message in the undeliverable queue and generate a non-delivery report. &nbsp;In addition, if an MTA is unable to route a message (ie no routing table entry match the message&#39;s O/R name), it will place the message in the undeliverable queue and generate a routing error report.&nbsp;</p>

### 입력

<p>Input to your program will consist of a series of message routing scenarios. &nbsp;Input for each scenario starts with a single line that contains a single integer (1 &lt;= M &lt;= 10) indicating the number of MTAs in the scenario. &nbsp;Subsequent lines will contain a description for each of the M MTAs.&nbsp;</p>

<p>Each MTA description starts with a line containing the name of the MTA (a left justified alphabetic string of 1 to 10 characters with no embedded spaces) in columns 1-10 and an integer (0 &lt;= I &lt;= 9) in column 12 indicating the number of entries in the MTA&#39;s routing table. &nbsp;Each of the following I lines will then contain a valid name of an adjacent MTA in columns 1-10 followed by the Country, ADMD, PRMD, and Organization Name in columns 15-24, 30-39, 45-54, and 60-69 respectively. &nbsp;Each O/R name component will consist of 1 to 10 alphabetic characters left-justified in their field with no embedded blanks. &nbsp;Alternatively, an O/R name component may contain a single asterisk (*) in the first column in the field indicating a wild-card match in the field.&nbsp;</p>

<p>Following the description of the MTAs, there will be a single line containg a single integer (0&lt;N&lt;32768) indicating the number of messages to be sent in the simulation. &nbsp;Each of the subsequent N lines will contain the description of exactly one message. &nbsp;Each message description contains a valid name of one of the MTAs described above left-justified in columns 1-10 followed by the Country, ADMD, PRMD, and Organization Name in columns 15-24, 30-39, 45-54, and 60-69 respectively. &nbsp;Each O/R name component will consist of 1 to 10 alphabetic characters left-justified in their field with no embedded blanks and the MTA name is where the message is submitted and the simulation begins.&nbsp;</p>

### 출력

<p>For each scenario, you are to print &quot;Scenario # X&quot; where X is the number of the scenario starting with 1 and incrementing for subsequent scenarios. &nbsp;Each of the following N lines will contain the number of the message left-justified in column 1 (ordered by the submission ordering in the input) immediately followed by one of the following messages:&nbsp;</p>

<ul>
	<li>&quot; -- delivered to MTA_NAME&quot;,&nbsp;</li>
	<li>&quot; -- circular routing detected by MTA_NAME&quot;, or&nbsp;</li>
	<li>&quot; -- unable to route at MTA_NAME&quot;.&nbsp;</li>
</ul>

<p>In all three messages, MTA_NAME is replaced by the name of the MTA generating the report. &nbsp;Other than MTA_NAME, you are to print the string exactly as above including spacing and dashes.&nbsp;</p>

<p>After the list of message reports, you are to print a single blank line and continue processing with the next scenario.&nbsp;</p>