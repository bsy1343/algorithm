# [Platinum I] Translators’ Dinner - 13353

[문제 링크](https://www.acmicpc.net/problem/13353)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 92, 정답: 50, 맞힌 사람: 34, 정답 비율: 49.275%

### 분류

해 구성하기, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>It is time again for the annual International Convention for Phonetic Communication. Because&nbsp;there are attendees from all over the world, and they do not all speak the same languages,&nbsp;the organizers have hired translators to help out.</p>

<p>To thank the translators at the end of the conference for their hard work, the organizers&nbsp;want to arrange a dinner at a nice local restaurant. However, the restaurant only has small,&nbsp;two person tables, hence the translators will have to be divided into pairs. As the organizers&nbsp;would like the translators to have a nice evening, they prefer that two translators sitting at the&nbsp;same table are both able to speak the same language. Write a program to help the organizers&nbsp;determine a way to match up the translators in pairs, so that each of the translators speaks&nbsp;a language that the other also speaks.</p>

### 입력

<p>The first line contains two numbers N and M, the number of languages spoken at the convention,&nbsp;and the number of hired translators respectively (2 &le; N &le; 100, 1 &le; M &le; 200).</p>

<p>The following M lines each describe a translator. Each of these lines contains two integers&nbsp;specifying the two languages that the translator speaks. Languages are identified by integers&nbsp;in the range [0, N &minus; 1].</p>

<p>Translators are identified by integers in the range [0, M &minus; 1]. Translators are listed in order&nbsp;of increasing identifier (i.e. the first listed translator has identifier 0).</p>

<p>There are no two translators who both speak the same two languages. Translators have&nbsp;been chosen such that any two languages spoken at the conference can be translated into one&nbsp;another, although it may take several translators.</p>

### 출력

<p>If it is possible to match up all translators such that each pair speaks a common language,&nbsp;output a possible matching: print M/2 lines, each line containing the two identifiers of a pair&nbsp;of matched translators. The pairs, as well as the translators within a pair, may be listed in&nbsp;any order.</p>

<p>There may be multiple possible matchings. In that case, print any one of them.</p>

<p>If it is not possible to match up all translators, output a single line containing the word&nbsp;&ldquo;impossible&rdquo;.</p>