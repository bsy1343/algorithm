# [Bronze III] Vikingahackare - 26906

[문제 링크](https://www.acmicpc.net/problem/26906)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 401, 정답: 354, 맞힌 사람: 313, 정답 비율: 91.254%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵

### 문제 설명

<p>Att vikingarna var duktiga krigare k&auml;nner nog de flesta till, men att de ocks&aring; hade bra programmerare &auml;r mindre v&auml;lk&auml;nt. Att programmera en runsten kr&auml;vde mycket tid och l&auml;mnade inte mycket rum f&ouml;r misstag. Detta gjorde tyv&auml;rr &auml;ven runstenarna extra s&aring;rbara f&ouml;r vikingahackare, som h&auml;rjade fritt.</p>

<p>Du har f&aring;tt i uppdrag att &ouml;vers&auml;tta en runsten fr&aring;n den h&auml;r tiden med hj&auml;lp av ett uppslagsverk av tecken och dess bin&auml;ra representation (vikingarna saknade h&ouml;gniv&aring;spr&aring;k och kodade direkt i ettor och nollor). Eftersom de flesta runstenar till slut blev hackade s&aring; finns det dock risk att vissa delar av koden &auml;r fel.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r ett tal $T$ ($1 \le T \le 16$), antalet tecken i alfabetet.</p>

<p>D&auml;refter f&ouml;ljer $T$ rader best&aring;ende av ett tecken (sm&aring; och stora bokst&auml;ver mellan <code>a-z</code> samt siffror kan f&ouml;rekomma) f&ouml;ljt av tecknets bin&auml;ra representation (en sekvens av ettor och nollor som alltid &auml;r av l&auml;ngd 4). Till sist f&ouml;ljer en str&auml;ng av $N$ ($1 \leq N \leq 4\,000)$ stycken ettor och nollor, runstenen som ska &ouml;vers&auml;ttas. Det &auml;r garanterat att $N$ &auml;r delbar med $4$ och att det inte finns tv&aring; olika tecken med samma bin&auml;ra representation i indata.</p>

### 출력

<p>Skriv ut en rad med $N$ tecken, &ouml;vers&auml;ttningen av runstenen. F&ouml;r de tecken som inte kunde &ouml;vers&auml;ttas korrekt ska ist&auml;llet ett <code>&quot;?&quot;</code> skrivas ut.</p>

### 힌트

<p>Vi f&aring;r reda p&aring; att <code>0100</code> ska &ouml;vers&auml;ttas till <code>a</code>, och att <code>1000</code> ska &ouml;vers&auml;ttas till <code>b</code>. Str&auml;ngen som ska &ouml;vers&auml;ttas &auml;r <code>0100100000101000</code>, vilket kan delas upp i tecknen <code>0100</code>, <code>1000</code>, <code>0010</code> och <code>1000</code>. Det tredje tecknet &auml;r det enda som inte kan &ouml;vers&auml;ttas, vilket ger utdatan <code>ab?b</code>.</p>