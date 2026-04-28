# [Silver I] Call Forwarding - 6489

[문제 링크](https://www.acmicpc.net/problem/6489)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 13, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

구현, 그래프 이론, 자료 구조, 그래프 탐색, 집합과 맵, 시뮬레이션, 해시를 사용한 집합과 맵

### 문제 설명

<p>Thanks to computer technology the functionality of phone systems has been greatly enhanced in the last ten years. &nbsp;We have automated menus, sophisticated answering machines, conference call capabilities, group addressing and so on. &nbsp;A common feature of a company&#39;s phone system is the ability to set call forwarding. For example, if Bob at the Nobody&#39;s Home Company (NHC) goes on vacation, he sets things up so that all calls coming to him are forwarded to his associate Jane. &nbsp;This problem addresses how phone systems might keep track of call forwarding.</p>

<p>Problem Statement: The phones at the NHC all have four digit extensions. &nbsp;Employees can set call forwarding by entering the appropriate information through their telephone interface. &nbsp;If an employee is going to be away they enter the following information: their extension, the time they are leaving, how long they will be away, and the extension that their calls should be forwarded to, with the following constraints:</p>

<ul>
	<li>All extensions consist of four digits.</li>
	<li>The extensions 0000 and 9999 are reserved for special use and will not be entered as information by an employee.</li>
	<li>Times are recorded in increments of 1 hour and are based on a clock that begins at 0000 at midnight every New Year&#39;s Eve. Therefore, when describing the time they are leaving, employees always use an integer between 0000 and 8784 (which is 366*24). The call forwarding system is completely reset at the beginning of the year.&nbsp;</li>
	<li>A call forward set to start at time X for a duration of Y will be in effect from time X to time X+Y inclusive.</li>
</ul>

<p>Users are &quot;good&quot; about the requests they enter. &nbsp;They follow the format rules. They do not enter a request such that the duration of the request would go past the end of the year. They do not enter two requests for their extension that overlap in time. &nbsp;Even though the users enter correct, clear, non-overlapping information from their own point of view, a degenerate situation can still occur in a call forwarding system, if requests have been made in such a way as to forward a call back to the original target of the call. &nbsp;For example if Bob forwards his calls to Sue, and Sue forwards her calls to Joe, and Joe forwards his calls to Bob then when somebody calls any of these three people their calls would be forwarded forever. &nbsp;To prevent this situation the call forwarding system uses the &quot;dead end&quot; number 9999. &nbsp;Any calls made to an extension involved in such a degenerate situation will be forwarded to the<br />
special 9999 extension.</p>

### 입력

<p>The first line contains an integer N between 1 and 10 describing how many call forwarding systems will be simulated by your program.&nbsp; Each call forwarding system will be represented by 0 to 100&nbsp; source time duration target&#39; lines.&nbsp; These lines represent the requests by the users to set up a call forwarding from the source&#39; to the&nbsp; target&#39; starting at the&nbsp; time&#39; for a length of duration&#39;, and will be in the form&nbsp; dddd dddd dddd dddd&#39;. A line with 0000 in the&nbsp; source&#39; position indicates the end of this portion of the input. The call forwarding requests are listed in the order received. They will be followed by 1 or more&nbsp; time extension&#39; lines, in the form&nbsp; dddd dddd&#39;, in non-decreasing order by&nbsp; time&#39; representing calls made into the system at&nbsp; time&#39; to&nbsp; extension&#39;. A line with 9000 in the&nbsp; time&#39; position indicates the end of this portion of the input.</p>

### 출력

<p>The first line of output must read CALL FORWARDING OUTPUT.&nbsp; This will be followed by sections of information about each of the call forwarding systems being simulated.&nbsp; Each of these sections should be headed by the line SYSTEM N, where N is the number (1, 2, ...) of the system.&nbsp; Within the section there should be a line describing the result of each of the calls made into the system, with the format &quot;AT dddd CALL TO dddd RINGS dddd&quot;.&nbsp; The final line of output should read END OF OUTPUT .</p>