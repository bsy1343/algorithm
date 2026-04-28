# [Silver III] Robotdammsugaren - 21361

[문제 링크](https://www.acmicpc.net/problem/21361)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 35, 맞힌 사람: 27, 정답 비율: 81.818%

### 분류

구현, 그래프 이론, 시뮬레이션, 격자 그래프

### 문제 설명

<p>En robotdammsugare st&auml;dar i en rutn&auml;ts-formad lagerlokal, d&auml;r tunga l&aring;dor ligger p&aring; vissa rutor. Dammsugaren styrs av en sekvens av kommandon: upp (&quot;<code>^</code>&quot;), h&ouml;ger (&quot;<code>&gt;</code>&quot;), ned (&quot;<code>v</code>&quot;), v&auml;nster (&quot;<code>&lt;</code>&quot;). N&auml;r roboten f&aring;r ett kommando &aring;ker den s&aring; l&aring;ngt den kan i den riktningen tills en l&aring;da &auml;r i v&auml;gen. Varje ruta robotdammsugaren n&aring;gon g&aring;ng befinner sig p&aring; st&auml;das, inklusive rutan den b&ouml;rjar p&aring;. Givet hur lagerlokalen ser ut, robotens startposition och en sekvens av kommandon, avg&ouml;r hur m&aring;nga <strong>olika rutor</strong> som kommer ha st&auml;dats n&auml;r sekvensen &auml;r klar.</p>

### 입력

<ul>
	<li>Den f&ouml;rsta raden inneh&aring;ller tre heltal: $R$ ($3 \le R \le 2000$) och $C$ ($3 \le C \le 2000$), antalet rader och kolumner i den rutn&auml;ts-formad lagerlokalen, samt $N$ ($1 \le N \le 2000$), l&auml;ngden p&aring; kommandosekvensen.</li>
	<li>Den andra raden inneh&aring;ller en $N$ l&aring;ng str&auml;ng best&aring;ende av &quot;<code>^</code>&quot;, &quot;<code>&gt;</code>&quot;,&quot;<code>v</code>&quot;,&quot;<code>&lt;</code>&quot;, kommandosekvensen som skickas till roboten.</li>
	<li>De f&ouml;ljande $R$ raderna utg&ouml;r en beskrivning av hur den rutn&auml;ts-formad lagerlokalen ser ut. Den $i$:te av dessa rader inneh&aring;ller $C$ tecken som beskriver hur den $i$:te raden ser ut. Varje tecken &auml;r antingen en punkt &quot;<code>.</code>&quot; om en ruta &auml;r tom, en fyrkant &quot;<code>#</code>&quot; om rutan inneh&aring;ller en l&aring;da eller &quot;<code>O</code>&quot; om rutan &auml;r robotens startposition. Det &auml;r garanterat att exakt en ruta inneh&aring;ller &quot;<code>O</code>&quot;. Dessutom &auml;r det garanterat att alla rutor l&auml;ngst kanten av rutn&auml;tet &auml;r &quot;<code>#</code>&quot;.</li>
</ul>

### 출력

<p>Skriv ut ett heltal -- antalet olika rutor som st&auml;das av roboten.</p>