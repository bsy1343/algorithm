# [Platinum IV] Liczby Erdösa - 7954

[문제 링크](https://www.acmicpc.net/problem/7954)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 2, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍, 그래프 이론, 오프라인 쿼리, 파싱, 문자열

### 문제 설명

<p>W środowisku naukowc&oacute;w znane jest pojęcie liczby Erd&ouml;sa od nazwiska słynnego matematyka. Możesz policzyć swoją liczbę Erd&ouml;sa jako najmniejszą z liczb wyznaczonych w spos&oacute;b następujący:</p>

<ul>
	<li>Erd&ouml;s ma liczbę 0.</li>
	<li>Jeśli napisałeś publikację z Erd&ouml;sem, to otrzymujesz liczbę 1.</li>
	<li>Jeśli napisałeś publikację z kimś kto ma liczbę 1, otrzymujesz liczbę 2, itd.</li>
</ul>

<p>Gdy nie ma zastosowania żadna z powyższych reguł, to liczba Erd&ouml;sa jest nieskończona. W założeniu im mniejsza wartość liczby Erd&ouml;sa, tym wyższy poziom naukowy danej osoby. Łatwo jednak zauważyć, że taka definicja nie uwzględnia rozwoju naukowc&oacute;w w czasie. Przykładowo jeśli Erd&ouml;s napisał pracę z A, natomiast A napisał z B, to A otrzymuje liczbę 1, a B liczbę 2. Mogło się jednak zdarzyć, że A napisał pracę z B na początku swojej kariery, natomiast z Erd&ouml;sem dużo p&oacute;źniej. Czy w tej sytuacji właściwie jest posiadanie liczby 2 przez B? W podanej definicji liczy się długość najkr&oacute;tszego łańcucha publikacji łączącego daną osobę z Erd&uml;osem. Aby uwzględnić wpływ czasu wprowadzamy założenie, że daty publikacji w łańcuchu zaczynającym się od Erd&ouml;sa muszą tworzyć ciąg silnie rosnący. Mając daną listę publikacji musisz odpowiedzieć na pytanie o liczbę Erd&ouml;sa podanej osoby w podanym roku z uwzględnieniem powyższego założenia.</p>

### 입력

<p>Pierwsza linia wejścia zawiera małą liczbę całkowitą z &ndash; liczbę zestaw&oacute;w danych występujących kolejno po sobie. Opis jednego zestawu jest następujący:</p>

<p>Składa się on w pierwszej linii z dw&oacute;ch liczb całkowitych p, q (1 &le; p, q &le; 100000) oznaczających odpowiednio liczbę publikacji i pytań. W kolejnych liniach znajduje się opis p publikacji. Opis publikacji składa się z jednej linii zawierającej y (1913 &le; y &le; 2005) oznaczającej rok publikacji oraz, po spacji, nazwiska (r&oacute;żnych) wszystkich wsp&oacute;łautor&oacute;w rozdzielonych spacjami. Nazwisko jest ciągiem liter alfabetu angielskiego. Pierwsza litera jest wielka pozostałe małe. Długość wynosi od 1 do 10 znak&oacute;w. Liczba autor&oacute;w danej pracy wynosi od 2 do 10. W kolejnych q liniach znajdują się pytania. Opis pytania składa się z liczby y będącej rokiem o kt&oacute;ry pytamy oraz, po spacji, nazwiska osoby (ograniczenia jak wyżej). Liczba autor&oacute;w w pliku nie przekracza 100000. Nazwisko Erd&ouml;sa występuje w pliku jako Erdos.</p>

### 출력

<p>Dla każdego zestawu danych wypisz q linii stanowiących odpowiedzi na pytania z zestawu. Dla każdego pytania wypisz liczbę Erd&uml;osa podanej osoby w pytanym roku. Jeśli liczba Erd&ouml;sa jest nieskończona wypisz <code>NIESKONCZONA</code>.</p>