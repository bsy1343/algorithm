# [Gold I] Robbery - 6336

[문제 링크](https://www.acmicpc.net/problem/6336)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 7, 맞힌 사람: 7, 정답 비율: 35.000%

### 분류

구현

### 문제 설명

<p>Inspector Robstop is very angry. Last night, a bank has been robbed and the robber has not been caught. And this happened already for the third time this year, even though he did everything in his power to stop the robber: as quickly as possible, all roads leading out of the city were blocked, making it impossible for the robber to escape. Then, the inspector asked all the people in the city to watch out for the robber, but the only messages he got were of the form &quot;We don&#39;t see him.&quot;&nbsp;</p>

<p>But this time, he has had enough! Inspector Robstop decides to analyze how the robber could have escaped. To do that, he asks you to write a program which takes all the information the inspector could get about the robber in order to find out where the robber has been at which time.&nbsp;</p>

<p>Coincidentally, the city in which the bank was robbed has a rectangular shape. The roads leaving the city are blocked for a certain period of time t, and during that time, several observations of the form &quot;The robber isn&#39;t in the rectangle Ri at time ti&quot; are reported. Assuming that the robber can move at most one unit per time step, your program must try to find the exact position of the robber at each time step.</p>

### 입력

<p>The input contains the description of several robberies. The first line of each description consists of three numbers W, H, t (1 &le;&nbsp;W,H,t &le; 100) where W is the width, H the height of the city and t is the time during which the city is locked.&nbsp;</p>

<p>The next contains a single integer n (0 &le; n &le; 100), the number of messages the inspector received. The next n lines (one for each of the messages) consist of five integers t<sub>i</sub>, L<sub>i</sub>, T<sub>i</sub>, R<sub>i</sub>, B<sub>i</sub> each. The integer t<sub>i</sub> is the time at which the observation has been made (1 &le; t<sub>i</sub> &le; t), and L<sub>i</sub>, T<sub>i</sub>, R<sub>i</sub>, B<sub>i</sub> are the left, top, right and bottom respectively of the (rectangular) area which has been observed. (1 &le; L<sub>i</sub> &le; R<sub>i</sub> &le; W, 1 &le; T<sub>i</sub> &le; B<sub>i</sub> &le; H; the point (1, 1) is the upper left hand corner, and (W, H) is the lower right hand corner of the city.) The messages mean that the robber was not in the given rectangle at time ti.&nbsp;</p>

<p>The input is terminated by a test case starting with W = H = t = 0. This case should not be processed.</p>

### 출력

<p>For each robbery, first output the line &quot;Robbery #k:&quot;, where k is the number of the robbery. Then, there are three possibilities:&nbsp;</p>

<p>If it is impossible that the robber is still in the city considering the messages, output the line &quot;The robber has escaped.&quot;&nbsp;</p>

<p>In all other cases, assume that the robber really is in the city. Output one line of the form &quot;Time step : The robber has been at x,y.&quot; for each time step, in which the exact location can be deduced. (x and y are the column resp. row of the robber in time step .) Output these lines ordered by time .&nbsp;</p>

<p>If nothing can be deduced, output the line &quot;Nothing known.&quot; and hope that the inspector will not get even more angry.&nbsp;</p>

<p>Output a blank line after each processed case.</p>