# [Platinum I] Subway - 9538

[문제 링크](https://www.acmicpc.net/problem/9538)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 28, 맞힌 사람: 14, 정답 비율: 28.571%

### 분류

다이나믹 프로그래밍, 그래프 이론, 자료 구조, 문자열, 그래프 탐색, 너비 우선 탐색, 해시를 사용한 집합과 맵, 파싱, 희소 배열

### 문제 설명

<p>Johny is going to visit his friend Michelle. His dad allowed him to go there on his own by subway. Johny loves traveling by subway and would gladly use this opportunity to spend half a day underground, but his dad obliged him to make as few line changes as possible. There are a lot of stations in the city, and several subway lines connecting them. All trains are perfectly synchronized &ndash; the travel between two consecutive stations on every line takes exactly one minute, and changing lines at any station takes no time at all.</p>

<p>Given the subway map, help Johny to plan his trip so that he can travel for as long as possible, while still following his dad&rsquo;s order.</p>

### 입력

<p>First line of input contains the number of test cases T. The descriptions of the test cases follow:</p>

<p>The description of each test case starts with an empty line. The next two lines begin with the strings Stops: and Lines:, and contain the names (separated by a comma and a space) of all subway stops and lines, respectively. A single line for each subway line follows (in no particular order), beginning with &lt;line-name&gt; route: and listing the names of the stops along this particular line. The final two lines specify the names of the (different) stations nearby Johny&rsquo;s and Michelle&rsquo;s homes.</p>

<p>In each test case, there are at most 300 000 stations and 100 000 lines, whose total length does not exceed 1 000 000. The names of lines and stations are between 1 and 50 characters long and can contain letters, digits, hyphens (-), apostrophes (&lsquo;) and &ldquo;and&rdquo; signs (&amp;). All lines are bidirectional (although changing the direction of travel counts as a line change) and there are no self-crossings.</p>

### 출력

<p>Print the answers to the test cases in the order in which they appear in the input. For each test case, print a single line summarizing the optimal route Johny can take (see example output for exact format). You may assume that such a route always exists.</p>