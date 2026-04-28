# [Gold V] Tarasy - 8548

[문제 링크](https://www.acmicpc.net/problem/8548)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 26, 맞힌 사람: 23, 정답 비율: 63.889%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p>W bajtockich g&oacute;rach wybudowano tarasy widokowe połączone za pomocą wind. Z tarasu położonego niżej można wjechać na taras sąsiedni, położony wyżej, za tyle kredytek ile wynosi r&oacute;żnica pomiędzy wysokościami taras&oacute;w. Z tarasu położonego wyżej na taras położony niżej zjeżdża się za darmo. Tarasy połączone są w łańcuch widokowy, w kt&oacute;rym z pierwszego tarasu można dostać się tylko na drugi, z drugiego na pierwszy i trzeci, itd. Policz jaka jest największa liczba r&oacute;żnych taras&oacute;w, kt&oacute;re bezpośrednio (czyli bez zjeżdżania z tarasu na ziemię) może odwiedzić turysta posiadający tylko <em>k</em>&nbsp;kredytek. Za wjazd na taras, od kt&oacute;rego zacznie swoją wędr&oacute;wkę, turysta nic nie płaci.</p>

### 입력

<p>W pierwszym wierszu podane są dwie liczby całkowite <em>n</em>, <em>k</em>&nbsp;(1 &le; <em>n</em> &le; 20 000, 0 &le; <em>k</em> &le; 20 000), oddzielone pojedynczym odstępem. Liczba taras&oacute;w to <em>n</em>, a <em>k</em>&nbsp;to liczba kredytek, kt&oacute;rymi dysponuje turysta. W kolejnych <em>n</em>&nbsp;wierszach podane są wysokości kolejnych taras&oacute;w: <em>h</em><sub>1</sub>, <em>h</em><sub>2</sub>, ..., <em>h<sub>n</sub></em>. Każde <em>h<sub>i</sub></em>&nbsp;spełnia nier&oacute;wności: 1 &le; <em>h<sub>i</sub></em> &le; 10 000.</p>

### 출력

<p>Program powinien wypisać tylko jedną liczbę, r&oacute;wną największej liczbie taras&oacute;w, kt&oacute;re może odwiedzić turysta za <em>k</em>&nbsp;kredytek.</p>