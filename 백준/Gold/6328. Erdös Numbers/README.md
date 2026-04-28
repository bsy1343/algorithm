# [Gold III] Erdös Numbers - 6328

[문제 링크](https://www.acmicpc.net/problem/6328)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 182, 정답: 34, 맞힌 사람: 27, 정답 비율: 19.853%

### 분류

너비 우선 탐색, 자료 구조, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 문자열, 집합과 맵

### 문제 설명

<p>The Hungarian Paul Erd&ouml;s (1913&ndash;1996, pronounced as &ldquo;Ar-dish&rdquo;) was not only one of the strangest mathematicians of the 20th century, he was also among the most famous ones. He kept on publishing widely circulated papers up to a very high age, and every mathematician having the honor of being a co-author to Erd&ouml;s is well respected.</p>

<p>Not everybody got a chance to co-author a paper with Erd&ouml;s, so many people were content if they managed to publish a paper with somebody who had published a paper with Erd&ouml;s. This gave rise to the so-called Erd&ouml;s numbers. An author who has jointly published with Erd&ouml;s had Erd&ouml;s number 1. An author who had not published with Erd&ouml;s but with somebody with Erd&ouml;s number 1 obtained Erd&ouml;s number 2, and so on. Today, nearly everybody wants to know what Erd&ouml;s number he or she has. Your task is to write a program that computes Erd&ouml;s numbers for a given set of scientists.</p>

### 입력

<p>The input file contains a sequence of scenarios, each scenario consisting of a paper database and a list of names. A scenario begins with the line &ldquo;p n&rdquo;, where p and n are natural numbers with 1 &le; p &le; 32000; 1 &le; n &le; 3000. Following this line are p lines containing descriptions of papers (this is the paper database). A paper is described by a line of the following form:</p>

<pre>
LastName1, FirstName1, LastName2, Firstname2,...: TitleOfThePaper</pre>

<p>The names and the title may contain any ASCII characters between 32 and 126 except commas and colons. There will always be exactly one space character following each comma. The first name may be abbreviated, but the same name will always be written in the same way. In particular, Erd&ouml;s&rsquo; name is always written as &ldquo;Erd&ouml;s, P. (Umlauts like &lsquo;&ouml;&rsquo;,&lsquo;&auml;&rsquo;,. . . are simply written as &lsquo;o&rsquo;,&lsquo;a&rsquo;, . . . .)</p>

<p>Example:</p>

<pre>
Smith, M.N., Martin, G., Erdos, P.: Newtonian forms of prime factors matrices.</pre>

<p>After the p papers follow n lines each containing exactly one name in the same format as in the paper database.</p>

<p>The line &lsquo;0 0&rsquo; terminates the input.</p>

<p>No name will consist of more than 40 characters. No line in the input file contains more than 250 characters. In each scenario there will be at most 10 000 different authors.</p>

### 출력

<p>For every scenario first print the number of the scenario in the format shown in the sample output. Then print for every author name in the list of names their Erd&ouml;s number based on the papers in the paper database of the scenario. The authors should be output in the order given in the input file. Authors that do not have any relation to Erd&ouml;s via the papers have Erd&ouml;s number infinity. Adhere to the format shown in the sample output.</p>