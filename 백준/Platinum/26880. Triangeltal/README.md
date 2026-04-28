# [Platinum IV] Triangeltal - 26880

[문제 링크](https://www.acmicpc.net/problem/26880)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 66, 정답: 10, 맞힌 사람: 9, 정답 비율: 29.032%

### 분류

그리디 알고리즘, 정렬, 해 구성하기

### 문제 설명

<p>I en klass med $N$ elever har det blivit dags f&ouml;r det obligatoriska momentet att h&aring;lla tal. De flesta av eleverna ser fram emot att h&aring;lla tal v&auml;ldigt mycket, och kan knappt v&auml;nta p&aring; sin tur. Men f&ouml;rst m&aring;ste de delas in i tre grupper. Alla i grupp $1$ kommer sedan presentera f&ouml;r grupp $2$, grupp $2$ f&ouml;r grupp $3$, och grupp $3$ f&ouml;r grupp $1$. </p>

<p>N&aring;got som kr&aring;nglar till den h&auml;r gruppindelningen &auml;r att eleverna har olika ambitionsniv&aring;. Varje elev $i$ kr&auml;ver att f&aring; h&aring;lla tal inf&ouml;r minst $A_i$ personer. S&aring; om elev nummer $i$ exempelvis hamnar i grupp $1$, s&aring; m&aring;ste grupp $2$ ha minst $A_i$ medlemmar f&ouml;r att elev $i$ ska bli n&ouml;jd.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26880.%E2%80%85Triangeltal/29b4c42a.png" data-original-src="https://upload.acmicpc.net/a16b958d-5834-4e41-9e7b-d82c6f9e9983/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 410px; height: 300px;" /></p>

<p style="text-align: center;">Bilden motsvarar f&ouml;rsta exemplet.</p>

<p>Du f&aring;r givet de $N$ talen $A_i$, och din uppgift &auml;r att avg&ouml;ra om det finns ett s&auml;tt att dela in eleverna i tre grupper s&aring; att alla blir n&ouml;jda, och hitta i s&aring; fall en giltig indelning.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $N$ ($3 \leq N \leq 5 \cdot 10^5$), antalet elever i klassen.</p>

<p>Den andra raden inneh&aring;ller $N$ heltal $A_i$ ($1 \leq A_i \leq N$), d&auml;r $A_i$ &auml;r antalet elever den $i$:te eleven minst vill h&aring;lla ett tal inf&ouml;r.</p>

### 출력

<p>Om det inte finns en giltig indelning, skriv ut en enda rad med str&auml;ngen &quot;<code>NO</code>&quot;.</p>

<p>Om det finns en giltig indelning, skriv f&ouml;rst ut en rad med str&auml;ngen &quot;<code>YES</code>&quot;. Skriv d&auml;refter ut en rad med en str&auml;ng $S$ best&aring;ende av tecknen $1$, $2$ och $3$. Tecknet p&aring; plats $i$ i denna str&auml;ng indikerar vilken grupp elev $i$ hamnade i. Om det finns flera l&ouml;sningar kan du skriva ut vilken som helst.</p>