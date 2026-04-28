# [Silver IV] Wizard of Odds - 15436

[문제 링크](https://www.acmicpc.net/problem/15436)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 205, 정답: 68, 맞힌 사람: 48, 정답 비율: 30.968%

### 분류

수학, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>You have just completed a brave journey to see&nbsp;<em>The Wizard of Odds</em>, who agrees to grant you any wish, so long as you can complete the following puzzle:</p>

<p>The Wizard starts by telling you two integers:&nbsp;<em>N</em>&nbsp;and&nbsp;<em>K</em>. He then secretly selects a number from 1 to&nbsp;<em>N</em>&nbsp;(inclusive), and does not tell you this number.</p>

<p>Your goal is to correctly guess the secret number. Before guessing, you are allowed to ask&nbsp;<em>K</em>&nbsp;&quot;true/false&quot; questions about the number, for example,&nbsp;<em>&quot;Is the number even?&quot;</em>&nbsp;or&nbsp;<em>&quot;Is the number between 7 and 10?&quot;</em>, or&nbsp;<em>&quot;Is the number 17 or 22?&quot;</em>, or&nbsp;<em>&quot;Is the number prime?&quot;</em>. And the Wizard will answer with &quot;true&quot; or &quot;false&quot; to each question. The Wizard will always answer honestly. After answering the&nbsp;<em>K</em>&nbsp;questions, you must guess the number. If you win (guess the number correctly), you will be granted your wish; but if the Wizard wins (you guess incorrectly), you will be turned into a flying monkey.</p>

<p>(Formally, you can think of a &quot;question&quot; as a function from&nbsp;<em>{1, 2, ..., N}</em>&nbsp;to&nbsp;<em>{true, false}</em>, and the Wizard will answer by telling you whether the value of the function is&nbsp;<em>true</em>&nbsp;or&nbsp;<em>false</em>&nbsp;for his secret number.)</p>

<p>Assuming that you have been told&nbsp;<em>N</em>&nbsp;and&nbsp;<em>K</em>, can you always exactly determine the Wizard&#39;s secret number (and guarantee that you win) using only&nbsp;<em>K</em>&nbsp;questions?</p>

### 입력

<p>The input consists of a single line containing two integers&nbsp;<em>N</em>&nbsp;and&nbsp;<em>K</em>&nbsp;(<em>2 &le; N &le; 10<sup>101</sup></em>,&nbsp;<em>0 &le; K &le; N</em>), separated by a single space.</p>

<p><em>Note: These inputs might NOT fit into a 64-bit integer.</em></p>

### 출력

<p>Output&nbsp;<code>&quot;Your wish is granted!&quot;</code>&nbsp;(without the quotes) if it is possible for you to guarantee that you win the game (regardless of the number the Wizard picks). Otherwise, print&nbsp;<code>&quot;You will become a flying monkey!&quot;</code>&nbsp;(without the quotes) if it is not possible.</p>