# [Gold III] Cells - 27710

[문제 링크](https://www.acmicpc.net/problem/27710)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 62, 정답: 25, 맞힌 사람: 8, 정답 비율: 26.667%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 파싱, 문자열, 집합과 맵

### 문제 설명

<p>Tim loves spreadsheets. Everything he does on a computer, he does in a spreadsheet. Track his expenses? Create a spreadsheet! Decide which car to buy? Create a spreadsheet to compare them! Make an inventory of his games? Create a spreadsheet! Decide which girl he loves most? &hellip;</p>

<p>Unfortunately his spreadsheet software just crashed and he needs some of the data right now and does not have the time to install a competing office suit.</p>

<p>Given the formulas used in the cells of a spreadsheet, calculate the values of all the cells.</p>

<p>When evaluating an expression, usual priorities apply: first we evaluate all * and / (left to right), and only then all + and - (again, left to right).</p>

<p>You may assume that the expressions are such that when evaluating the expression in correct order, the result and also all intermediate values will fit into 32-bit signed integer variables.</p>

<p>The operator / represents integer division which is always rounded down. The dividend will always be non-negative and the divisor will always be positive.</p>

### 입력

<p>The first line of the input file contains an integer T specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case starts a single number N giving the number of expression. Each of the following N lines contains a single cell formula of the form &ldquo;CELL = EXPRESSION&rdquo;, where CELL is the name of the cell and EXPRESSION is a mathematical expression consisting of cell names and the operators +, -, * and /. A cell name is a non-empty sequence of letters followed by a positive integer. The length of cell name is less than or equal to 5.</p>

<p>Each test case is correct: there are no cycles, and all cells referenced in expressions have definitions.</p>

### 출력

<p>For each test case output the calculated values of cells, one per line, in the form &ldquo;CELL = VALUE&rdquo;. The rows in the output should be ordered alphabetically. (To compare two rows, take a look at the first character where they differ. The one with a smaller ASCII value goes first.)</p>