# [Bronze I] Sub-prime - 13672

[문제 링크](https://www.acmicpc.net/problem/13672)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 83, 정답: 76, 맞힌 사람: 71, 정답 비율: 92.208%

### 분류

구현

### 문제 설명

<p>The most recent economic crisis was partly caused by the manner in which banks made loans to people unable to repay them and resold such loans to other banks as debentures. Obviously, when people failed to repay their loans, the whole system collapsed.</p>

<p>The crisis was so deep that it affected countries all over the world, including Nlogonia, where the honored prime minister Man Dashuva ordered the Central Bank chairman to come up with a solution. He came up with a brilliant idea: if all banks could liquidate its debentures only with its own monetary reserves, all banks would survive and the crisis would be averted.</p>

<p>However, with the elevated number of debentures and banks involved, this was an extremely complicated task, so he asked for your help in writing a program that, given the banks and the debentures printed by them, determines if it is possible that all banks pay back their debts using only their monetary reserves and credits.</p>

### 입력

<p>The input consists of several test cases. The first line of each test case contains two integers&nbsp;<em>B</em>&nbsp;and&nbsp;<em>N</em>, indicating the number of banks (1 &le; B &le; 20) and the number of debentures printed by the banks (1 &le; N &le; 20). The banks are identified by integers between 1 and&nbsp;<em>B</em>. The second line contains&nbsp;<em>B</em>&nbsp;integers&nbsp;<em>R</em><sub>i</sub>&nbsp;separated by spaces, indicating the monetary reserves of each one of the&nbsp;<em>B</em>&nbsp;banks (0 &le; R<sub>i&nbsp;</sub>&le; 10<sup>4</sup>, for 1 &le; i &le; B). The&nbsp;<em>N</em>&nbsp;following lines contain each one three integers separated by spaces: an integer&nbsp;<em>D</em>, indicating the debtor bank (1 &le; D &le; B), an integer&nbsp;<em>C</em>&nbsp;, indicating the creditor bank (1 &le; C &le; B e D &ne; C) and an integer&nbsp;<em>V</em>, indicating the debenture value (1 &le; V &le; 10<sup>4</sup>).</p>

<p>The end of input is indicated by a line containing only two zeros, separated by spaces.</p>

### 출력

<p>For each test case, your program should print a single line, containing a single character: &#39;S&#39;, if it is possible to liquidate all debentures without a bailout from the Central Bank of Nlogonia, or &#39;N&#39; if a bailout is necessary.</p>