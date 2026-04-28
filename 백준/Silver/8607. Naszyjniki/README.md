# [Silver III] Naszyjniki - 8607

[문제 링크](https://www.acmicpc.net/problem/8607)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 13, 맞힌 사람: 13, 정답 비율: 36.111%

### 분류

구현

### 문제 설명

<p>Pasją małej Małgosi jest zbieranie naszyjnik&oacute;w złożonych z r&oacute;żnorodnych koralik&oacute;w. Jej kolekcja jest już na tyle duża, że postanowiła ją opisać. Każdy naszyjnik został zapisany jako ciąg liter alfabetu angielskiego. Kolejnym literom odpowiadają kolejne koraliki naszyjnika, przy czym pierwszy i ostatni koralik sąsiadują ze sobą.</p>

<p>Małgosia dzieli koraliki na małe i duże oraz na jasne i ciemne. Przy zapisywaniu małych koralik&oacute;w korzystała z małych liter alfabetu, natomiast przy zapisywaniu dużych koralik&oacute;w używała liter wielkich. Do oznaczania koralik&oacute;w jasnych używała samogłosek (czyli liter&nbsp;<i>a, e, i, o, u, y</i>), natomiast do ciemnych - sp&oacute;łgłosek.</p>

<p>Dziewczynka zamierza podzielić każdy ze swoich naszyjnik&oacute;w na najmniejszą możliwą liczbę segment&oacute;w (czyli kawałk&oacute;w naszyjnika złożonych z kolejnych koralik&oacute;w), z kt&oacute;rych każdy ma się składać z koralik&oacute;w o tej samej wielkości i o tym samym odcieniu. Zastanawia się, jak w prosty spos&oacute;b, mając dany jedynie opis naszyjnika, dowiedzieć się, jaki jest jego najdłuższy i najkr&oacute;tszy segment. Może się co prawda zdarzyć, że jeden naszyjnik będzie zawierać kilka segment&oacute;w o minimalnej bądź maksymalnej długości, jednak w takim wypadku dziewczynkę interesuje zawsze segment złożony z większych koralik&oacute;w, bądź z koralik&oacute;w jaśniejszych, jeżeli rozmiar koralik&oacute;w w &quot;remisowych&quot; segmentach jest taki sam.</p>

<p>Pom&oacute;ż Małgosi rozwiązać ten problem! Dla danych naszyjnik&oacute;w określ długości segment&oacute;w interesujących Małgosię oraz charakterystykę składających się na nie koralik&oacute;w.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita $n$&nbsp;($1 &le; n &le; 20$) oznaczająca liczbę naszyjnik&oacute;w do zbadania. W każdym z kolejnych $n$&nbsp;wierszy znajduje się opis jednego naszyjnika w postaci ciągu małych i wielkich liter alfabetu angielskiego (bez żadnych odstęp&oacute;w).</p>

<p>Sumaryczna długość wszystkich ciąg&oacute;w stanowiących opisy naszyjnik&oacute;w w żadnych teście nie przekroczy $1\,000\,000$.</p>

### 출력

<p>Tw&oacute;j program powinien dla każdego wczytanego naszyjnika wypisać na standardowe wyjście dokładnie dwa wiersze, zawierające odpowiednio opis najdłuższego i najkr&oacute;tszego segmentu tego naszyjnika. W przypadku istnienia kilku segment&oacute;w r&oacute;wnej długości (minimalnych bądź maksymalnych), należy wypisać informację o segmencie o większych koralikach, jeżeli zaś r&oacute;wnież rozmiar koralik&oacute;w w segmentach jest taki sam, to należy wybrać segment jaśniejszy.</p>

<p>Każdy opis segmentu powinien składać się z jednej liczby całkowitej oraz jednego słowa, oddzielonych pojedynczym odstępem, oznaczających odpowiednio liczbę koralik&oacute;w wchodzących w skład segmentu oraz jego rodzaj. Rodzaj segmentu powinien być jednym ze sł&oacute;w:</p>

<ul>
	<li><code>jasne</code>, jeśli segment składa się z jasnych, małych koralik&oacute;w,</li>
	<li><code>JASNE</code>, jeśli segment składa się z jasnych, dużych koralik&oacute;w,</li>
	<li><code>ciemne</code>, jeśli segment składa się z ciemnych, małych koralik&oacute;w,</li>
	<li><code>CIEMNE</code>, jeśli segment składa się z ciemnych, dużych koralik&oacute;w.</li>
</ul>