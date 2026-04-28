# [Gold IV] Wyścig - 8585

[문제 링크](https://www.acmicpc.net/problem/8585)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 12, 맞힌 사람: 11, 정답 비율: 45.833%

### 분류

수학, 이분 탐색, 누적 합

### 문제 설명

<p>Wyścig Tour de Bajtocja jest organizowany co roku na trasie z miasta A do miasta B. Ze względu na dziurę budżetową, w tym roku wyścig odbędzie się tylko na pewnym odcinku trasy. Nie jest jeszcze ustalone, jaki to będzie odcinek, choć ustalona jest już jego długość. Na całej trasie rozstawione są znaki ograniczające prędkość jazdy. Ograniczenie obowiązuje do momentu zmiany tego ograniczenia przez inny znak. Wyścig Tour de Bajtocja znany jest z obowiązku przestrzegania ograniczeń prędkości.</p>

<p>Organizatorzy zastanawiają się, jaki fragment trasy (o długości $m$) wybrać, aby przestrzegając ograniczeń prędkości, można było go jak najszybciej przejechać.</p>

<p>Zostałeś poproszony o napisanie programu, kt&oacute;ry wyznaczy najkr&oacute;tszy czas przejechania takiego fragmentu trasy.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się trzy liczby całkowite $n$, $m$&nbsp;oraz $d$&nbsp;($1 &le; n &le; 1\,000\,000$, $1 &le; m &le; d &le; 10^9$), pooddzielane pojedynczymi odstępami, oznaczające odpowiednio liczbę znak&oacute;w ustawionych na trasie, długość odcinka, na kt&oacute;rym powinien odbyć się wyścig, oraz długość trasy z A do B.</p>

<p>Następne $n$&nbsp;wierszy zawiera opisy kolejnych znak&oacute;w ustawionych na trasie. Opis znaku składa się z dw&oacute;ch liczb całkowitych $s_i$, $v_i$&nbsp;($0 &le; s_i &le; d$, $1 &le; v_i &le; 1\,000\,000$), oddzielonych pojedynczym odstępem, oznaczających odpowiednio odległość $i$-tego znaku od miasta A oraz ograniczenie prędkości obowiązujące od ustawienia tego znaku. Możesz założyć, że $0 = s_1 &lt; s_2 &lt; \dots &lt; s_n$.</p>

### 출력

<p>W pierwszym i jedynym wierszu standardowego wyjścia Tw&oacute;j program powinien wypisać jedną liczbę rzeczywistą zaokrągloną do dokładnie trzech cyfr po kropce dziesiętnej, oznaczającą najkr&oacute;tszy możliwy czas przejechania trasy długości $m$. Wybierany odcinek trasy nie może wykraczać poza trasę z miasta A do miasta B.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8585.%E2%80%85Wy%C5%9Bcig/9da286f0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/8585.%E2%80%85Wy%C5%9Bcig/9da286f0.png" data-original-src="https://upload.acmicpc.net/91d2b9f1-93f3-41b6-a020-2538107bc747/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p><b>Wyjaśnienie do przykładu:</b>&nbsp;Optymalna trasa zaczyna się w odległości $2$&nbsp;od miasta A. Czas przejechania tej trasy jest r&oacute;wny $\frac{2}{50} + \frac{2}{40} = \frac{9}{100}$.</p>

<p><b>Wskaz&oacute;wka:</b>&nbsp;Aby uniknąć błęd&oacute;w zaokrągleń, do obliczeń polecamy używać typ&oacute;w rzeczywistych podw&oacute;jnej precyzji (<code>double</code>) oraz standardowych procedur/funkcji służących do wypisywania liczb rzeczywistych z zadaną precyzją.</p>