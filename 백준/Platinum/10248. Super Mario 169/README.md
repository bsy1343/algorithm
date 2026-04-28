# [Platinum III] Super Mario 169 - 10248

[문제 링크](https://www.acmicpc.net/problem/10248)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 49, 정답: 18, 맞힌 사람: 15, 정답 비율: 40.541%

### 분류

비트마스킹, 브루트포스 알고리즘, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 기하학, 3차원 기하학, 구현, 외판원 순회 문제

### 문제 설명

<p>Siggy is quite the video game enthusiast, and he&rsquo;s been playing lots of Super Mario 169 lately (the highly obscure sequel to the more popular Super Mario 64). This game takes place entirely in an ocean, which can be modelled with a 3 dimensional coordinate system. The player&rsquo;s objective is to swim around as the titular character, Mario, and collect all of the coins, of which there can be up to 169.</p>

<p>The coins are not simply in plain sight, however! Instead, there are up to 13 switches which Mario can press by touching them. Pressing any switch causes up to 13 coins to appear. Additionally, each switch can only be pressed once, and when it&rsquo;s pressed, any other uncollected coins (which had been revealed by the previously-pressed switch, if any) disappear, meaning that Mario will be unable to collect them in the future. All switches and coins are small enough that they can be treated as points.</p>

<p>To make sure that he&rsquo;s playing the game as optimally as possible, Siggy wants to know the minimum possible distance required to collect all of the coins.</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a single line with four integers:</p>

<pre>
n mx my mz</pre>

<p>where n (1&le;n&le;13) is the number of switches, and the 3D point (mx,my,mz) is Mario&rsquo;s starting point.&nbsp;</p>

<p>The following pattern is then repeated n times, once for each switch. The pattern begins with a single line with four integers:</p>

<pre>
k sx sy sz</pre>

<p>where k (1&le;k&le;13) is the number of coins activated by this switch, and the 3D point (sx,sy,sz) is the point where the switch is found. Following this there will be k lines with three integers:</p>

<pre>
cx cy cz</pre>

<p>where (cx,cy,cz) is the 3D point of one of the coins activated by this switch.</p>

<p>All coordinates x, y, z of all points will be in the range -1,000&le;x,y,z&le;1,000, and all points in a test case, whether Mario&rsquo;s starting point, switch or coin, will be unique. The input will end with a line with four 0s.</p>

### 출력

<p>For each test case, output a single number equal to the minimum distance for Mario to travel in order to collect all of the coins, given to exactly two decimal places, rounded. Output each number on its own line, with no spaces. Do not print any blank lines between outputs.</p>