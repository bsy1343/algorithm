# [Gold III] Lawrence of Arabia - 4115

[문제 링크](https://www.acmicpc.net/problem/4115)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 54, 정답: 29, 맞힌 사람: 11, 정답 비율: 57.895%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>T. E. Lawrence was a controversial figure during World War I. He was a British officer, who served in the Arabian theater. He led a group of Arab nationals in guerilla strikes against the Ottoman Empire. His primary targets were the railroads. A highly fictionalized version of his exploits was presented in the blockbuster movie, &ldquo;Lawrence of Arabia&rdquo;.</p>

<p>You are to write a program to help Lawrence figure out how to best use his limited resources. You have some information from British Intelligence. First, the rail line is completely linear &ndash; there are no branches, no spurs. Next, British Intelligence has assigned a Strategic Value to each depot &ndash; an integer from 1 to 5. But, a depot is of no use on its own, it only has value if it is connected to other depots. The Strategic Value of the entire railroad is calculated by adding up the products of the Strategic Values for every pair of depots that are connected, directly or indirectly, by the rail line. Consider this railroad:&nbsp;</p>

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4115/1.png" style="height:62px; width:562px" /></p>

<p>Its Strategic Value is 4*5 + 4*1 + 4*2 + 5*1 + 5*2 + 1*2 = 49.</p>

<p>Now, suppose that Lawrence only has enough resources for one attack. He cannot attack the depots themselves &ndash; they&rsquo;re too well defended. He must attack the rail line between depots, in the middle of the desert. Consider what would happen if Lawrence attacked this rail line right in the middle:&nbsp;</p>

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4115/2.png" style="height:92px; width:565px" /></p>

<p>The Strategic Value of the remaining railroad is 4*5 + 1*2 = 22. But, suppose Lawrence attacks between the 4 and 5 depots:&nbsp;</p>

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4115/3.png" style="height:91px; width:573px" /></p>

<p>The Strategic Value of the remaining railroad is 5*1 + 5*2 + 1*2 = 17. This is Lawrence&rsquo;s best option.</p>

<p>Given a description of a railroad and the number of attacks that Lawrence can perform, figure out the smallest Strategic Value that he can achieve for that railroad.&nbsp;</p>

### 입력

<p>There will be several data sets. Each data set will begin with a line with two integers, N and M. N is the number of depots on the railroad (1 &lt;= N &lt;= 500), and M is the number of attacks Lawrence has resources for (0 &lt;= M &lt; N). On the next line will be N integers, each from 1 to 5, indicating the Strategic Value of each depot in order. End of input will be marked by a line with two spaceseparated 0&rsquo;s.&nbsp;</p>

### 출력

<p>For each data set, print a single integer, indicating the smallest Strategic Value for the railroad that Lawrence can achieve with his attacks. Print each integer on its own line. There should be no blank lines between outputs.&nbsp;</p>