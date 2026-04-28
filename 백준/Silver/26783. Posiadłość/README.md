# [Silver I] Posiadłość - 26783

[문제 링크](https://www.acmicpc.net/problem/26783)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 13, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

수학, 그리디 알고리즘, 백트래킹

### 문제 설명

<p>Po pełnej sukces&oacute;w karierze informatyka, Bajtek zdecydował się w końcu kupić dom, w kt&oacute;rym zamieszka na stałe. W Bajtocji najbardziej elitarnym miasteczkiem są Wzg&oacute;rza Bajtocji, gdzie mieszka wiele bogatych i sławnych ludzi. Tam właśnie Bajtek chciałby się osiedlić.</p>

<p>W tym mieście wszystkie domy są ponumerowane od 1 do 10<sup>18</sup>, a najbardziej ekskluzywne domy na sprzedaż znajdują się pomiędzy numerami A i B włączając oba końce tego przedziału.</p>

<p>Ceny dom&oacute;w są podawane w prosty spos&oacute;b. Posiadłość o numerze X kosztuje tyle bajtodolar&oacute;w, ile wynosi suma cyfr w zapisie dziesiętnym liczby X. Dla przykładu, dom o numerze 42 będzie kosztował 6 bajtodolar&oacute;w, bo 4 + 2 = 6, natomiast dom o numerze 1337 będzie kosztował 1+3+3+7 = 14 bajtodolar&oacute;w. Bajtek dość długo odkładał pieniądze na sw&oacute;j nowy dom, dlatego chciałby kupić najdroższy dostępny dom.</p>

<p>Napisz program, kt&oacute;ry wczyta numer początkowego oraz końcowego domu na sprzedaż, wyznaczy koszt najdroższego z dom&oacute;w i wypisze wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym i jedynym wierszu wejścia znajdują się dwie liczby naturalne A oraz B (1 &le; A &le; B &le; 10<sup>18</sup>), oddzielone pojedynczym odstępem określające kolejno numer pierwszego oraz ostatniego domu na sprzedaż.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście jedną liczbę naturalną M oznaczającą cenę najdroższej posiadłości na sprzedaż.</p>