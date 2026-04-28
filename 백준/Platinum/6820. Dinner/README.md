# [Platinum III] Dinner - 6820

[문제 링크](https://www.acmicpc.net/problem/6820)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 8, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>On the way to dinner, the CCC competitors are lining up for their delicious curly fries. The N (1 &le; N &le; 100) competitors have lined up single-file to enter the cafeteria.</p>

<p>Doctor V, who runs the CCC, realized at the last minute that programmers simply hate standing in line next to programmers who use a different language. Thankfully, only two languages are allowed at the CCC: Gnold and Helpfile. Furthermore, the competitors have decided that they will only enter the cafeteria if they are in a group of at least K (1 &lt;= K &lt;= 6) competitors.</p>

<p>Doctor V decided to iterate the following scheme:</p>

<ul>
	<li>He will find a group of K or more competitors who use the same language standing next to each other in line and send them to dinner.</li>
	<li>The remaining competitors will close the gap, potentially putting similar-language competitors together</li>
</ul>

<p>So Doctor V recorded the sequence of competitors for you. Can all the competitors dine? If so, what is the minimum number of groups of competitors to be sent to dinner?</p>

<p>Note: Test cases worth 60% of the points have K &le; 2. Out of these, on test cases worth one third of the points (20% of the total points), N &le; 10</p>

### 입력

<p>The first line contains two integers N and K.</p>

<p>The second line contains N characters that are the sequence of competitors in line (H represents Helpfile, G represents Gnold)</p>

### 출력

<p>Output, on one line, the single number that is the minimum number of groups that are formed for dinner. If not all programmers can dine, output &minus;1.</p>

### 힌트

<p>There are seven competitors: a Gnold programmer followed by two Helpfile programmers, followed by another Gnold programmer, followed by another two Helpfile programmers followed by a final Gnold programmer. Programmers want to goto dinner in pairs.</p>

<p>First send the first pair of Hs to dinner, leaving GGHHG. Then send the second pair of Hs to dinner, leaving GGG; finally, send in the group of Gs. It might be coincidental that the two pairs of Helpfile programmers entered the cafeteria successively.</p>