# [Bronze IV] Betygsättning - 20839

[문제 링크](https://www.acmicpc.net/problem/20839)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2325, 정답: 1241, 맞힌 사람: 1142, 정답 비율: 53.018%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>Pelle &auml;r programmeringsl&auml;rare p&aring; Pelles Optimeringsskola (PO-skolan). Han h&aring;ller nu p&aring; att s&auml;tta betyg p&aring; sina elever i kursen Optimering $1$.</p>

<p>Betygs&auml;ttning g&aring;r till p&aring; f&ouml;ljande vis. Totalt finns det $x$ <code>A</code>-kriterier, $y$ <code>C</code>-kriterier och $z$ <code>E</code>-kriterier som anv&auml;nds. F&ouml;r att f&aring; betyget <code>E</code> m&aring;ste man uppfylla samtliga <code>E</code>-kriterier. F&ouml;r att f&aring; betyget <code>C</code> m&aring;ste man uppfylla samtliga <code>C</code>- och <code>E</code>-kriterier. F&ouml;r att f&aring; betyget <code>A</code> m&aring;ste man uppfylla samtliga <code>A</code>-, <code>C</code>- och <code>E</code>-kriterier.</p>

<p>Dessutom finns det tv&aring; speciella betyg. Om man uppfyller alla <code>E</code>-kriterier och minst h&auml;lften av <code>C</code>-kriterierna f&aring;r man ett <code>D</code>. Om man uppfyller alla <code>E</code>- och <code>C</code>-kriterier och minst h&auml;lften av <code>A</code>-kriterierna f&aring;r man ett <code>B</code>.</p>

<p>Pelle tycker det &auml;r v&auml;ldigt jobbigt att s&auml;tta betyg, och beh&ouml;ver din hj&auml;lp. Skriv ett program som tar emot antalet <code>A</code>-, <code>C</code>- och <code>E</code>-kriterier en viss elev har uppfyllt och skriver ut vilket betyg eleven ska ha. Du kan anta att eleven alltid fick minst <code>E</code> i kursen.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r tre heltal $1 \leq x \leq 30$, $1 \leq y \leq 30$ och $1 \leq z \leq 30$, antalet <code>A</code>-, <code>C</code>- och <code>E</code>-kriterier som finns. P&aring; den andra raden st&aring;r tre heltal $0 \leq x&#39; \leq x$, $0 \leq y&#39; \leq y$ och $0 \leq z&#39; \leq z$, antalet <code>A</code>-, <code>C</code>- och <code>E</code>-kriterier som eleven har uppfyllt.</p>

### 출력

<p>Programmet ska skriva ut en bokstav: <code>A</code>, <code>B</code>, <code>C</code>, <code>D</code>, eller <code>E</code>.</p>

### 힌트

<p>I exempelfall $1$ uppfyller eleven alla kriterier utom ett <code>A</code>-kriterium. Eleven f&aring;r d&auml;rf&ouml;r ett <code>B</code>.</p>

<p>I exempelfall $2$ uppfyller eleven alla <code>E</code>-kriterier men inte h&auml;lften av <code>C</code>-kriterierna. Eleven f&aring;r d&auml;rf&ouml;r ett <code>E</code>.</p>