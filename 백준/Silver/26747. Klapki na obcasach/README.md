# [Silver I] Klapki na obcasach - 26747

[문제 링크](https://www.acmicpc.net/problem/26747)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 23, 맞힌 사람: 16, 정답 비율: 88.889%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>W Bajtocji powstał właśnie nowy aquapark, a w nim zjeżdżalnia. Niestety, do zjazdu z tej zjezdżalni dopuszczone są tylko osoby mające co najmniej T bajtometr&oacute;w wzrostu.</p>

<p>Na szczęście w sklepie przy aquaparku można kupić specjalne klapki na obcasach. Założenie j-tej pary klapek powoduje, że staje się wyższym o A<sub>j</sub> bajtometr&oacute;w, a do pomiaru wzrostu nikt przecież klapek zdejmować nie każe. Rzecz jasna, każda osoba może założyć co najwyżej jedną parę klapek.</p>

<p>Bajtek wraz z grupą przyjaci&oacute;ł chcą teraz mądrze rozplanować, jakie klapki należy kupić i założyć, aby jak najwięcej os&oacute;b mogło zjechać ze zjeżdżalni. Ze względ&oacute;w higienicznych osoby nie mogą się po założeniu wymieniać klapkami.</p>

<p>Napisz program, kt&oacute;ry wyznaczy największą liczbę os&oacute;b jakie mogą zjechać ze zjeżdżalni (dla optymalnego rozplanowania klapek).</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 200 000) określająca liczbę os&oacute;b w grupie (razem z Bajtkiem). W drugim wierszu znajduje się ciąg N liczb naturalnych H<sub>i</sub> (1 &le; H<sub>i</sub> &le; 10<sup>9</sup>) pooddzielanych pojedynczymi odstępami. Są to wzrosty kolejnych os&oacute;b w grupie. W trzecim wierszu wejścia znajduje się jedna nieujemna liczba całkowita M (0 &le; M &le; 200 000) określająca liczbę par klapek, kt&oacute;re są dostępne w sklepie. W czwartym wierszu wejścia znajduje się ciąg M liczb naturalnych A<sub>j</sub> (1 &le; A<sub>j</sub> &le; 10<sup>9</sup>) pooddzielanych pojedynczymi odstępami. Są to rozmiary obcas&oacute;w w kolejnych parach klapek w sklepie. W piątym (ostatnim) wierszu wejścia znajduje się jedna liczba naturalna T (1 &le; T &le; 2 &middot; 10<sup>9</sup>) &ndash; minimalny wzrost, od kt&oacute;rego można zjechać ze zjeżdżalni.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia należy wypisać jedną nieujemną liczbę całkowitą &ndash; największą możliwą liczbę os&oacute;b, kt&oacute;re mogą zjechać ze zjeżdżalni zgodnie z warunkami powyżej.</p>