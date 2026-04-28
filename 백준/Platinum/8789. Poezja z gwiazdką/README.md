# [Platinum IV] Poezja z gwiazdką - 8789

[문제 링크](https://www.acmicpc.net/problem/8789)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 7, 맞힌 사람: 5, 정답 비율: 13.158%

### 분류

자료 구조, 문자열, 브루트포스 알고리즘, 트리, 이분 탐색, 집합과 맵, 해시를 사용한 집합과 맵, 트라이

### 문제 설명

<p>W pewnym egzotycznym języku indiańskim istnieje&nbsp;<strong>N</strong>&nbsp;r&oacute;żnych niepustych sł&oacute;w złożonych z małych liter alfabetu angielskiego.&nbsp;</p>

<p>Język posiada specyficzną właściwość, niespotykaną w żadnym innym języku. Ot&oacute;ż w piśmie używa się specjalnego znaku - gwiazdki (&#39;*&#39;), kt&oacute;rym można zastąpić dowolny (być może pusty) sp&oacute;jny fragment pojedynczego słowa. Dzięku temu zapisane słowa stają się wieloznaczne, co sprawia, że w języku można pisać wyjątkowo głębokie wiersze. Utrudnia to codzienne życie, ale w końcu sztuka jest ważniejsza niż biografia.</p>

<p>Znając listę wszystkich sł&oacute;w w języku (w pełnym brzmieniu, bez gwiazdek) oraz tekst poematu, w kt&oacute;rym w każdym słowie użyto dokładnie jednej gwiazdki, oblicz ile sł&oacute;w z języka odpowiada każdemu ze sł&oacute;w w poemacie.&nbsp;</p>

<p>Przykładowo, jeśli język zawiera słowa [&quot;zupa&quot;,&quot;z&quot;,&quot;malpy&quot;,&quot;intruz&quot;,&quot;pyszny&quot;], to w poemacie [&quot;z*&quot;, &quot;m*y&quot;, &quot;g*ingo&quot;] pierwszemu słowu poematu odpowiadają dwa słowa z języka, drugiemu - jedno, a trzeciemu - żadne (musiało dojść do błędu w druku).</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) opisująca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii opisu zestawu znajduje się liczba naturalna&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N&nbsp;</strong>&lt;= 100000) oznaczająca liczbę sł&oacute;w w języku.</p>

<p>W kolejnych&nbsp;<strong>N</strong>&nbsp;liniach podawane są kolejne słowa z języka. Słowa są parami r&oacute;żne i każde składa się z minimalnie 1, a maksymalnie 10 małych liter alfabetu angielskiego.</p>

<p>W kolejnej linii opisu zestawu znajduje się liczba naturalna&nbsp;<strong>K</strong>&nbsp;( 1 &lt;=&nbsp;<strong>K</strong>&nbsp;&lt;= 100000) oznaczająca liczbę sł&oacute;w w poemacie.</p>

<p>W kolejnych&nbsp;<strong>K</strong>&nbsp;liniach podawane są kolejne słowa poematu. Słowa nie muszą być parami r&oacute;żne, każde z nich składa się z minimalnie 1, a maksymalnie 10 znak&oacute;w, z kt&oacute;rych dokładnie jeden to gwiazdka, a pozostałe są małymi znakami alfabetu angielskiego.</p>

### 출력

<p>Dla każdego zestawu należy w&nbsp;<strong>K</strong>&nbsp;liniach wypisać liczby sł&oacute;w z języka odpowiadających kolejnym słowom poematu.</p>