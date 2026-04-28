# [Gold II] Rozkłady dwójkowe - 8562

[문제 링크](https://www.acmicpc.net/problem/8562)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 7, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

수학, 그리디 알고리즘, 재귀, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Rozkładem dw&oacute;jkowym liczby <em>n</em>&nbsp;nazywamy ciąg &quot;cyfr&quot; <em>a<sub>k</sub>a</em><sub><em>k</em>-1</sub>...<em>a</em><sub>1</sub><em>a</em><sub>0</sub>, taki że</p>

<ol>
	<li>każda z cyfr <em>a</em><sub>0</sub>, <em>a</em><sub>1</sub>, ..., <em>a<sub>k</sub></em>&nbsp;jest r&oacute;wna&nbsp;1, 0&nbsp;lub -1;</li>
	<li>najbardziej znacząca cyfra w rozkładzie, czyli <em>a<sub>k</sub></em>, jest r&oacute;żna od zera;</li>
	<li><em>n</em> = <em>a<sub>k</sub></em>&middot;2<em><sup>k</sup></em> + <em>a</em><sub><em>k</em>-1</sub>&middot;2<sup><em>k</em>-1</sup> + ... + <em>a</em><sub>1</sub>&middot;2 + <em>a</em><sub>0</sub>.</li>
</ol>

<p>Można łatwo zauważyć, że liczba może mieć wiele r&oacute;żnych rozkład&oacute;w dw&oacute;jkowych. Spośr&oacute;d tych wszystkich rozkład&oacute;w,&nbsp;<b><i>optymalnymi</i></b>&nbsp;nazwiemy te, kt&oacute;re mają najmniejszą liczbę cyfr niezerowych. Na przykład, rozkładami dw&oacute;jkowymi liczby 15&nbsp;są:&nbsp;<i>1000<u>1</u></i>,&nbsp;<i>1111</i>&nbsp;i&nbsp;<i>100<u>1</u>1</i>&nbsp;(dla wygody cyfrę -1&nbsp;oznaczyliśmy tu jako&nbsp;<i><u>1</u></i>). Pierwszy z tych rozkład&oacute;w jest rozkładem optymalnym dla 15.</p>

<p>Twoim zadaniem jest napisanie programu, kt&oacute;ry obliczy, jaka jest liczba cyfr niezerowych w optymalnym rozkładzie dw&oacute;jkowym podanej liczby.</p>

### 입력

<p>Program powinien czytać dane ze standardowego wejścia. W pierwszym wierszu danych podana jest liczba <em>r</em>&nbsp;(1 &le; <em>r</em> &le; 500). W drugim wierszu podana jest liczba dziesiętna <em>n</em>&nbsp;złożona z <em>r</em>&nbsp;cyfr. Liczba <em>n</em>&nbsp;jest zapisana począwszy od najbardziej znaczących cyfr (tzn. tradycyjnie) i rozpoczyna się od cyfry r&oacute;żnej od zera.</p>

### 출력

<p>Program powinien pisać wynik na wyjście standardowe. Wynikiem powinna być liczba oznaczająca liczbę cyfr niezerowych w optymalnym rozkładzie dw&oacute;jkowym liczby <em>n</em>.</p>