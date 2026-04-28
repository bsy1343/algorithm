# [Gold II] Jasiek - 8439

[문제 링크](https://www.acmicpc.net/problem/8439)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

애드 혹, 기하학, 픽의 정리, 다각형의 넓이

### 문제 설명

<p>Jasiek ma dopiero 6 lat, ale już przejawia liczne talenty. Bardzo lubi rysować i układać zagadki. Dzisiaj rano dostał od mamy kartkę w kratkę, oł&oacute;wek i z wielką ochotą zabrał się do rysowania. Wszystkie rysunki Jaśka mają pewne wsp&oacute;lne cechy:</p>

<ul>
	<li>Jasiek zaczernia pełne kratki;</li>
	<li>jeżeli dwie zaczernione kratki dotykają się, to mają wsp&oacute;lny bok lub r&oacute;g;</li>
	<li>są sp&oacute;jne, co oznacza, że między każdymi dwiema zaczernionymi kratkami istnieje ciąg zaczernionych kratek, w kt&oacute;rym każde dwie kolejne kratki mają wsp&oacute;lny bok;</li>
	<li>nie ma białych dziur, czyli że z każdej białej kratki można narysować linię do brzegu kartki, kt&oacute;ra nigdy nie dotknie jakiejkolwiek zaczernionej kratki.</li>
</ul>

<p>W południe zadzwoniła mama i zapytała, co przedstawia dzisiejszy rysunek Jaśka. Maluch nie odpowiedział wprost, tylko opisał rysunek podając ciąg ruch&oacute;w potrzebnych do obejścia zaczernionych kratek na brzegu rysunku, czyli takich, kt&oacute;re mają co najmniej jeden wsp&oacute;lny r&oacute;g z jakąś białą kratką. Jasiek ustalił kratkę początkową, a następnie podał ciąg kierunk&oacute;w, w kt&oacute;rych należy się posuwać, żeby obejść cały rysunek. Wiadomo, że Jasiek opisał rysunek w kierunku przeciwnym do ruchu wskaz&oacute;wek zegara. Mama była wielce zaskoczona złożonością rysunku, a w szczeg&oacute;lności liczbą zaczernionych kratek. Czy potrafiłbyś na podstawie opisu Jaśka szybko obliczyć, ile jest zaczernionych kratek na rysunku?</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta (ze standardowego wejścia) opis rysunku Jaśka,</li>
	<li>policzy liczbę wszystkich zaczernionych kratek,</li>
	<li>wypisze wynik (na standardowe wyjście).</li>
</ul>

### 입력

<p>Wejście składa się z szeregu wierszy, z kt&oacute;rych każdy zawiera tylko jeden znak. Wiersz pierwszy zawiera dużą literę P, natomiast wiersz ostatni - dużą literę K. Litera P oznacza początek opisu, a litera K jego koniec. W każdym z pozostałych wierszy (jeżeli takie są) zapisano jedną literę N, W, S lub E, gdzie N oznacza p&oacute;łnoc, W - zach&oacute;d, S - południe, a E - wsch&oacute;d. Każdy wiersz wejścia odpowiada pewnej kratce na brzegu rysunku. Wiersz pierwszy i ostatni odpowiadają tej samej kratce, od kt&oacute;rej zaczyna się i w kt&oacute;rej kończy się opis. Litera w wierszu r&oacute;żnym od wiersza pierwszego i ostatniego m&oacute;wi, w kt&oacute;rym kierunku należy p&oacute;jść, żeby przejść do kolejnej kratki brzegowej przy obchodzeniu rysunku przeciwnie do ruchu wskaz&oacute;wek zegara. Opis Jaśka nie jest nadmiarowy, tzn. kończy się po obejściu całego rysunku i dotarciu do kratki początkowej. Długość opisu nigdy nie przekracza 20000 liter.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać (na standardowe wyjście) tylko jeden wiersz z jedną liczbą całkowitą r&oacute;wną liczbie zaczernionych kratek na rysunku Jaśka.</p>