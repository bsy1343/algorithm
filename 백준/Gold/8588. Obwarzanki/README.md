# [Gold IV] Obwarzanki - 8588

[문제 링크](https://www.acmicpc.net/problem/8588)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Witek wybrał się na jarmark. W mgnieniu oka zlokalizował stoisko z najlepszymi obwarzankami. Nie zastanawiając się długo kupił jedną porcję obwarzank&oacute;w. Warto wiedzieć, że Bajtockie obwarzanki są zawsze nawlekane na patyk, a nie na k&oacute;łko, jak na większości naszych jarmark&oacute;w. Obwarzanki można zdejmować z lewego bądź prawego końca patyka. Każdego obwarzanka charakteryzują dwie wartości: średnica zewnętrzna (Z) i średnica wewnętrzna (W). Jest to przedstawione na rysunku.</p>

<p>Gdy chcemy wyjąć pewien obwarzanek znajdujący się pomiędzy innymi obwarzankami, to możemy spr&oacute;bować przełożyć jednego obwarzanka przez drugiego. Uda nam się to tylko wtedy, gdy średnica wewnętrzna kt&oacute;regoś z tych dw&oacute;ch obwarzank&oacute;w jest większa bądź r&oacute;wna od średnicy zewnętrznej drugiego z nich. W przeciwnym wypadku musimy najpierw zdjąć obwarzanka z lewej bądź prawej strony.</p>

<p>Witkowi spodobał się pewien obwarzanek i zastanawia się, ile minimalnie innych obwarzank&oacute;w będzie musiał zdjąć, zanim dostanie się do swojego wybranego.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite $n$, $m$&nbsp;($1 &le; m &le; n &le; 1\,000\,000$), oznaczające odpowiednio liczbę obwarzank&oacute;w znajdujących się na patyku oraz numer obwarzanka (licząc od lewej strony), kt&oacute;rego wybrał Witek.</p>

<p>W $n$&nbsp;następnych wierszach znajdują się opisy kolejnych obwarzank&oacute;w nawleczonych na patyk, począwszy od lewej strony. Każdy z tych wierszy zawiera dwie liczby całkowite $w_i$&nbsp;oraz $z_i$&nbsp;($1 &le; w_i &lt; z_i &le; 1\,000\,000\,000$) oddzielone pojedynczym odstępem, oznaczające odpowiednio średnicę wewnętrzną oraz średnicę zewnętrzną $i$-tego obwarzanka.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/798fd759-a392-4d36-86b6-c7e0240af1f9/-/preview/" /></p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą r&oacute;wną minimalnej liczbie dodatkowych obwarzank&oacute;w, jakie powinien zdjąć Witek, aby dostać się do wybranego. W wyniku nie należy uwzględniać obwarzanka wybranego przez Witka.</p>