# [Silver IV] Brakujące cyfry - 8762

[문제 링크](https://www.acmicpc.net/problem/8762)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 31, 맞힌 사람: 31, 정답 비율: 63.265%

### 분류

사칙연산, 브루트포스 알고리즘, 수학, 문자열

### 문제 설명

<p>Hektor i Wiktor są w trakcie opracowywania własnego systemu szyfrującego. Prace nad nim posuwają się jednak dość powoli, jak na razie ustalili jedynie, w jaki spos&oacute;b szyfrowane będą ciągi cyfr.</p>

<p>Szyfrowany ciąg jest rozbijany na pojedyncze cyfry, kt&oacute;re są kodowane osobno. Szyfrogram pojedynczej cyfry&nbsp;<strong>d</strong>&nbsp;składa się z dw&oacute;ch całkowitych dodatnich liczb<strong>&nbsp;A</strong>,&nbsp;<strong>B</strong>. W dokładnie jednej z tych liczb dokładnie jedna cyfra jest zastąpiona znakiem &#39;<strong>x</strong>&#39;. Liczby&nbsp;<strong>A</strong>&nbsp;i&nbsp;<strong>B</strong>&nbsp;oraz pozycja &#39;<strong>x</strong>&#39; dobrane są w ten spos&oacute;b, że szyfrowana cyfra&nbsp;<strong>d</strong>&nbsp;jest najmniejszą cyfrą, kt&oacute;ra wstawiona w miejsce &#39;<strong>x</strong>&#39; sprawia, że&nbsp;<strong>A</strong>&nbsp;dzieli się przez&nbsp;<strong>B</strong>.</p>

<p>Hektor z Wiktorem napisali już program szyfrujący i zwr&oacute;cili się do Ciebie z prośbą o napisanie programu deszyfrującego.</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii pojedynczego zestawu testowego znajduje się jedna liczba całkowita&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 100 ), określająca liczbę cyfr zaszyfrowanego ciągu. Każda z następnych&nbsp;<strong>N</strong>&nbsp;linii zawiera szyfrogram jedej cyfry zakodowanego ciągu, składa się więc z dw&oacute;ch liczb całkowitych&nbsp;<strong>A</strong>&nbsp;i&nbsp;<strong>B</strong>&nbsp;( 1 &lt;=&nbsp;<strong>B</strong>&nbsp;&lt;=&nbsp;<strong>A</strong>&nbsp;&lt;= 1000000000 ) oddzielonych pojedynczą spacją. W dokładnie jednej z tych dw&oacute;ch liczb dokładnie&nbsp;jedna cyfra jest zastąpiona znakiem &#39;<strong>x</strong>&#39;.</p>

<p>Ani&nbsp;<strong>A</strong>&nbsp;ani&nbsp;<strong>B</strong>&nbsp;nie zawierają / nie mogą zawierać zer wiodących - tj. nie zaczynają się od 0.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać ciąg cyfr, kt&oacute;rego szyfrogram został podany na wejściu. Kolejność wypisywanych odpowiedzi musi odpowiadać kolejności zestaw&oacute;w na wejściu.</p>

### 힌트

<p>W pierwszym zestawie testowym wynikiem jest 3713, ponieważ:</p>

<ul>
	<li>2<strong>3</strong>&nbsp;dzieli się przez 23</li>
	<li>29<strong>7</strong>&nbsp;dzieli się przez 9</li>
	<li>1331 dzieli się przez&nbsp;<strong>1</strong>1</li>
	<li>45825 dzieli się przez 1<strong>3</strong></li>
</ul>