# [Gold III] Datorköp - 20881

[문제 링크](https://www.acmicpc.net/problem/20881)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

구현, 브루트포스 알고리즘, 이분 탐색, 재귀

### 문제 설명

<p>Ett f&ouml;retag har precis k&ouml;pt in nya datorer: $x$ station&auml;ra och $y$ b&auml;rbara. En station&auml;r dator kostar $a$ dollar och en b&auml;rbar $b$ dollar, d&auml;r $1\le a,b \le 1000$. F&ouml;retaget har $n$ avdelningar och de anses olika viktiga gentemot varandra. VDn har best&auml;mt att datorerna ska distribueras enligt f&ouml;ljande enkla regel: <em>En viktigare avdelning ska f&aring; datorer till ett v&auml;rde som &auml;r minst lika stort som en mindre viktig avdelning.</em></p>

<p>Klara f&aring;r i uppdrag att g&ouml;ra f&ouml;rdelningen. Trots att Klara &auml;r j&auml;tteduktig jobbar hon p&aring; den minst viktiga avdelningen. F&ouml;r att bli popul&auml;r bland avdelningskollegorna vill hon f&ouml;rst&aring;s ordna datorer till h&ouml;gsta m&ouml;jliga v&auml;rde till sin avdelning. Hon har bett dig om hj&auml;lp! Skriv ett program som, givet variablerna $x$, $a$, $y$, $b$ och $n$ ber&auml;knar det h&ouml;gsta m&ouml;jliga v&auml;rdet p&aring; datorerna som Klaras avdelning kan f&aring;?</p>

### 입력

<p>En rad med de fem heltalen $x$, $a$, $y$, $b$ och $n$.</p>

### 출력

<p>Programmet ska skriva ut en rad med ett heltal: det h&ouml;gsta m&ouml;jliga v&auml;rdet p&aring; datorerna som ges till den minst viktiga avdelningen.</p>

### 제한

<ul>
	<li>$2\le n\le 1000$</li>
	<li>$0\le x,y \le 1000$</li>
</ul>