# [Platinum V] Materiały Wybuchowe - 8755

[문제 링크](https://www.acmicpc.net/problem/8755)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

(분류 없음)

### 문제 설명

<p>Dostałeś kontrakt na przew&oacute;z materiał&oacute;w wybuchowych. Dysponujesz n ciężar&oacute;wkami, każda o pojemności&nbsp;<em>x<sub>i</sub></em>.</p>

<p>Dla każdej ciężar&oacute;wki musisz zaplanować, jak zapakować ją materiałami wybuchowymi. Niestety każda ciężar&oacute;wka musi by szczelnie wypeniona materiałami wybuchowymi, gdyż w innym wypadku podczas przewozu materiały mogą ulec uszkodzeniu. Masz do dyspozycji k r&oacute;żnych rodzaj&oacute;w materiał&oacute;w wybuchowych o r&oacute;żnych wielkościach <em>y<sub>i</sub></em>. Każdego z materiał&oacute;w możesz zawsze wyprodukować tyle, ile potrzebujesz. Ze względu na szybkość pakowania i rozładowywania ciężar&oacute;wek zależy ci, aby do zapakowania ciężar&oacute;wki użyć jak najmniej materiał&oacute;w.</p>

<p>Policz, ile materiał&oacute;w użyć dla każdej ciężar&oacute;wki.</p>

### 입력

<p>W pierwszej linii wejcia znajdują się dwie liczby całkowite <em>n</em>, <em>k</em> (1 &le; <em>n</em> &le; 1000, 1 &le; <em>k</em> &le; 100), oznaczające odpowiednio ile jest ciężar&oacute;wek oraz ile jest rodzaj&oacute;w materiał&oacute;w wybuchowych. W nastpnych <em>k</em>&nbsp;liniach znajdują się kolejne wielkości kolejnych rodzaj&oacute;w materiał&oacute;w <em>y<sub>i</sub></em> (1 &le; <em>y<sub>i</sub></em> &lt; 10<sup>5</sup>). Można założyć, że dwa dowolne rodzaje materiał&oacute;w mają zawsze r&oacute;żne wielkości. W nastpnych <em>n</em>&nbsp;liniach znajduj się wielkości kolejnych ciężar&oacute;wek <em>x<sub>i</sub></em>&nbsp;(10<sup>10</sup> &le; <em>x<sub>i</sub></em> &le; 10<sup>17</sup>).</p>

### 출력

<p>Na wyjściu w każdej z kolejnych <em>n</em>&nbsp;linii powinna znaleźć się pojedycza liczba <em>w<sub>i</sub></em>, m&oacute;wiąca ile najmniej materiał&oacute;w wybuchowych należy użyć, aby szczelnie zapakować <em>i</em>-tą ciężar&oacute;wkę, bądź pojedycze słowo &#39;NIE&#39; jeśli jest to niemożliwe.</p>