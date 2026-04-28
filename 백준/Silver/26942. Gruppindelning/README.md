# [Silver II] Gruppindelning - 26942

[문제 링크](https://www.acmicpc.net/problem/26942)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 101, 정답: 83, 맞힌 사람: 66, 정답 비율: 88.000%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 깊이 우선 탐색, 해시를 사용한 집합과 맵, 분리 집합

### 문제 설명

<p>Under en skolutflykt ska eleverna delas in i olika grupper. Naturligtvis vill eleverna vara i samma grupp som sina kompisar. Skriv ett program som, givet namnet p&aring; varje elev samt vem som &auml;r kompis med vem, ber&auml;knar det maximala antalet grupper som eleverna kan delas in i (om eleverna f&aring;r som de vill).</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r ett heltal: antalet elever som ska p&aring; utflykt ($2 \le n \le 100$). D&auml;refter f&ouml;ljer $n$ rader, var och en inneh&aring;llande namnet p&aring; en elev. Varje namn &auml;r mellan $1$ och $20$ tecken l&aring;ngt och inneh&aring;ller endast bokst&auml;verna <code>A-Z</code>. Alla elever har olika namn.</p>

<p>Sedan f&ouml;ljer en rad med ett heltal: antalet kompispar ($1 \le m \le 4950$). Slutligen f&ouml;ljer $m$ rader inneh&aring;llande kompisparen. F&ouml;r varje par anges tv&aring; namn p&aring; samma rad, separerade med ett mellanslag.</p>

### 출력

<p>Programmet ska skriva ut en rad med ett heltal: det maximala antalet grupper som eleverna kan delas in i.</p>