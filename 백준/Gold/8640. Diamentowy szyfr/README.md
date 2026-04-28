# [Gold III] Diamentowy szyfr - 8640

[문제 링크](https://www.acmicpc.net/problem/8640)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 11, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

임의 정밀도 / 큰 수 연산, 해 구성하기, 수학

### 문제 설명

<p>Renomowana firma jubilerska zam&oacute;wiła u Ciebie oprogramowanie zabezpieczające sejfy. Firma produkuje dwa rodzaje sejf&oacute;w do przechowywania diament&oacute;w - jeden z $20$&nbsp;przełącznikami, a drugi z $200$&nbsp;przełącznikami. Aby otworzyć sejf potrzebujesz hasła, kt&oacute;re składa się z ciągu cyfr. Opracuj program, kt&oacute;ry na podstawie hasła wygeneruje spos&oacute;b ustawienia przełącznik&oacute;w. Przełączniki ponumerowano od $0$&nbsp;do $N-1$, $i$-tej pozycji przyporządkowano wartość $3^i$. Pojedynczy przełącznik ma 3 stany (G&oacute;ra, Zero i D&oacute;ł). Sejf otwiera się jeżeli suma wartości przyporządkowanych przełącznikom ustawionym do g&oacute;ry odjąć suma wartości przyporządkowanych przełącznikom ustawionym na d&oacute;ł r&oacute;wna się wartości hasła.</p>

<p>Opracuj program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia hasła do sejf&oacute;w</li>
	<li>dla każdego hasła wygeneruje ustawienie przełącznik&oacute;w,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu zapisano wartość $N$&nbsp;oznaczającą liczbę haseł ($1 &le; N &le; 250$). W każdym z następnych $N$&nbsp;wierszy znajduje się jedna liczba bez zer znaczących oznaczająca hasło do sejfu. Połowa test&oacute;w zawiera wyłącznie hasła odpowiadające sejfom z $20$&nbsp;przełącznikami.</p>

### 출력

<p>Dla każdego hasła wypisz stan przełącznik&oacute;w otwierających sejf w dw&oacute;ch wierszach. W pierwszym wierszu wypisz liczbę przełącznik&oacute;w ustawionych do g&oacute;ry oraz ich numery, w drugim wierszu liczbę przełącznik&oacute;w ustawionych w d&oacute;ł oraz ich numery. Wszystkie liczby w obrębie jednego wiersza należy oddzielać pojedynczym znakiem spacji.</p>