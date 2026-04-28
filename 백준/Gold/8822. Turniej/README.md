# [Gold III] Turniej - 8822

[문제 링크](https://www.acmicpc.net/problem/8822)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 10, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

수학, 트리, 확률론, 최소 공통 조상

### 문제 설명

<p>W pewnym mieście odbywa się turniej sztuk walki. Startuje w nim&nbsp;<strong>N</strong>&nbsp;zawodnik&oacute;w, z czego dw&oacute;ch stanowią bracia - Olek i Felek.</p>

<p>W turniejowych pojedynkach bierze udział po dw&oacute;ch zawodnik&oacute;w i każdy pojedynek ma jednego zwycięzce, kt&oacute;ry pozostaje w turnieju, podczas gdy przegrany odpada. Układ pojedynk&oacute;w ilustruje &quot;drzewo turniejowe&quot; ustalane przed zawodami. Poniżej prezentujemy przykładowe drzewo turniejowe dla turnieju z czterema zawodnikami. W ż&oacute;łtych polach &quot;zaczynają&quot; zawodnicy, zielone pola oznaczają pojedynki.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8822.%E2%80%85Turniej/5b7910e5.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8822.%E2%80%85Turniej/5b7910e5.png" data-original-src="https://upload.acmicpc.net/f5037e07-b926-4b81-b470-260f0f06a0be/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Na początku turnieju zawodnicy rozlosowywani są po pozycjach startowych, i każde przyporządkowanie zawodnik&oacute;w do ż&oacute;łtych p&oacute;l jest tak samo prawdopodobne.</p>

<p>Co więcej, w tym roku poziom jest tak wyr&oacute;wnany, że należy przyjąć, że każdy pojedynek z r&oacute;wnym prawdopodobieństwem zostanie wygrany przez każdego z dw&oacute;ch biorących w nim udział zawodnik&oacute;w.</p>

<p>Oblicz prawdopodobieństwo, że w toku turnieju bracia Olek i Felek będą ze sobą walczyć.</p>

### 입력

<p>W pierwszej linii znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 5 ). Następnie podawane są opisy kolejnych zestaw&oacute;w.</p>

<p>Opis zestawu rozpoczyna się od liczby naturalnej&nbsp;<strong>N</strong>&nbsp;( 2 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 1000 ) określającej liczbę zawodnik&oacute;w w turnieju. Następnie podawane są opisy wszystkich&nbsp;<strong>N</strong>-1 pojedynk&oacute;w turniejowych ( numerowanych kolejno od 1 do&nbsp;<strong>N</strong>-1 ), po jednym w linii.</p>

<p>Opis pojedynku składa się z dw&oacute;ch oddzielonych spacją ciąg&oacute;w znak&oacute;w, każdy z nich opisuje jednego z zawodnik&oacute;w walczących w pojedynku.</p>

<ul>
	<li>Z<strong>liczba</strong>&nbsp;( np. Z1, Z4, etc, 1 &lt;=&nbsp;<strong>liczba</strong>&nbsp;&lt;=&nbsp;<strong>N</strong>&nbsp;) oznacza zawodnika na pozycji startowej liczba.</li>
	<li>P<strong>liczba</strong>&nbsp;( np. P1, P4, etc, 1 &lt;=&nbsp;<strong>liczba</strong>&nbsp;&lt;=&nbsp;<strong>N</strong>-1 ) oznacza zawodnika, kt&oacute;ry zwycięży w pojedynku o numerze liczba.</li>
</ul>

<p>Można przyjąć, że opis tworzy poprawne drzewo turniejowe, tj. każda pozycja startowa przypisana jest dokładnie do jednego pojedynku i zwycięzca każdego pojedynku poza jednym przypisany jest do dokładnie jednego pojedynku.</p>

### 출력

<p>Dla każdego zestawu należy wypisać w osobnej linii prawdopodobieństwo, że w Olek z Felkiem będą ze sobą walczyć z dokładnością do 0.0001.</p>