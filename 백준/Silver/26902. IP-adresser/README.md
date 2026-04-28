# [Silver III] IP-adresser - 26902

[문제 링크](https://www.acmicpc.net/problem/26902)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 42, 맞힌 사람: 37, 정답 비율: 80.435%

### 분류

브루트포스 알고리즘, 문자열

### 문제 설명

<p>En IPv4-address best&aring;r av fyra heltal mellan $0$ och $255$ (som vardera inte f&aring;r ha n&aring;gra inledande nollor), separerade av punkter. T.ex. &auml;r <code>1.0.3.255</code> en giltig address, medan <code>1.0.03.255</code>, <code>1.0.3.256</code> och <code>1.0.3</code> inte &auml;r giltiga addresser. Givet en sekvens av siffror, hitta alla giltiga IPv4-adresser som kan skapas genom ins&auml;ttning av tre punkter i sekvensen.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r en str&auml;ng med minst $4$ och max $12$ siffror.</p>

### 출력

<p>Skriv ut ett heltal: antalet giltiga IP-adresser som kan bildas genom att s&auml;tta in 3 punkter.</p>

### 힌트

<p>F&ouml;rklaring av exempelfall 1: Det finns endast en giltig ip-address som kan bildas, <code>255.255.255.255</code>. Alla andra uts&auml;ttningar av punkter ger tal som &auml;r l&auml;ngre 3.</p>

<p>F&ouml;rklaring av exempelfall 2: Eftersom det finns 4 siffror finns bara en giltig uts&auml;ttning punkter. Eftersom siffran noll &auml;r till&aring;ten blir svaret <code>0.0.0.0</code>.</p>

<p>F&ouml;rklaring av exempelfall 3: Hur punkterna &auml;n placers ut kommer det alltid finnas tal med inledande nollor som inte &auml;r siffran noll. D&auml;rf&ouml;r blir svaret 0.</p>

<p>F&ouml;rklaring av exempelfall 4: 7 str&auml;ngar kan bildas$\colon$</p>

<ol>
	<li><code>2.9.18.41</code></li>
	<li><code>2.9.184.1</code></li>
	<li><code>2.91.8.41</code></li>
	<li><code>2.91.84.1</code></li>
	<li><code>29.1.8.41</code></li>
	<li><code>29.1.84.1</code></li>
	<li><code>29.18.4.1</code></li>
</ol>