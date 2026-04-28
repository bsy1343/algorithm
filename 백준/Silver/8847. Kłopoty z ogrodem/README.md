# [Silver III] Kłopoty z ogrodem - 8847

[문제 링크](https://www.acmicpc.net/problem/8847)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 22, 맞힌 사람: 19, 정답 비율: 46.341%

### 분류

두 포인터

### 문제 설명

<p>Pan Wincenty bardzo lubi sw&oacute;j ogr&oacute;d, niestety - bardzo nie lubi w nim pracować. A już szczeg&oacute;lnie nie lubi grabić opadłych (jak to jesienią) liści. Po kilku latach (i - co za tym idzie - kilku spędzonych na grabieniu liści jesieniach) pan Wincenty uznał, że miarka się przebrała - jego ogr&oacute;d jest po prostu za duży. Postanowił więc oddać część swojego terenu sąsiadom (i niech oni już sobie grabią liście).</p>

<p>Ogr&oacute;d pana Wincentego jest dość nietypowy - ma (ogr&oacute;d, nie pan Wincenty) kształt prostokąta o wymiarach 1 na N i dzieli się na N kolejnych p&oacute;l o wymiarach 1 na 1.&nbsp; W każdym z tych p&oacute;l rośnie albo trawa, albo drzewo kasztanowe. Pan Wincenty chce pozostawić sobie jak największą część ogrodu, z zachowaniem następujących zastrzeżeń:</p>

<ul>
	<li>W pozostawionej części ogrodu musi być co najwyżej K drzew kasztanowych</li>
	<li>Pozostawiona część ogrodu musi być sp&oacute;jna, to znaczy stanowić ciąg kolejnych p&oacute;l</li>
</ul>

<p>Jaka jest maksymalna długość fragmentu ogrodu, kt&oacute;ry pan Wincenty może sobie pozostawić?</p>

### 입력

<p>W pierwszej linii wejścia podana jest liczba test&oacute;w L (L &lt;= 5). Następnie podawane są opisy poszczeg&oacute;lnych test&oacute;w.</p>

<p>Jeden test składa się z dw&oacute;ch linii - w pierwszej znajdują się opisane w treści liczby naturalne N i K (0 &lt; K &lt;= N &lt;= 1000000).</p>

<p>W drugiej znajduje się opis ogrodu pana Wincentego - ciąg znak&oacute;w długości N. Każdy znak ciągu to &#39;K&#39; lub &#39;T&#39;, w zależności od tego, czy w danym polu rośnie kasztanowiec, czy tylko trawa.</p>

### 출력

<p>Dla każdego testu w osobnej linii wypisz maksymalną długość fragmentu ogrodu, jaki pan Wincent może sobie pozostawić.</p>