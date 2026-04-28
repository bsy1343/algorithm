# [Bronze II] Outfits - 7601

[문제 링크](https://www.acmicpc.net/problem/7601)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 342, 정답: 183, 맞힌 사람: 143, 정답 비율: 50.709%

### 분류

구현

### 문제 설명

<p>Becs and Cas are best friends. Cas left school when she was 16 as she has total fashion shopping skills, and became a manager at Supre. So, she and Becs get their clothes from Supre - and in fact they have always bought exactly what the other has (they are that shallow), but they would simply die if they wore the same thing on the same day.</p>

<p>The two friends are so into copying each other that they have exactly the same outfits in their wardrobes hanging in exactly the same order. However, sometimes one of them just hates an outfit, so throws it out. (For the sake of friendship she doesn&#39;t tell the other and if she&#39;s ever asked about it by text she pretends it is at the cleaners).</p>

<p>One difference between the girls is that Becs numbers her outfits from left to right, so outfit 1 is the leftmost outfit, whereas Cas numbers them from right to left, so 1 is the rightmost outfit. Their wardrobes look the same, though, so, for example, the leftmost outfit in each wardrobe is the same.</p>

<p>Your task in this problem is to write a program that would alert Becs and Cas in advance if they choose the same outfit for a particular day.&nbsp;</p>

### 입력

<p>Input consists of a number of scenarios. Each scenario starts with two integers, n and d. n (5 &lt; n &lt;= 50) represents the number of outfits in each girl&#39;s wardrobe before any are thrown out. d represents the number of days to be considered. The last line of input is a scenario containing 0 0 &ndash; this is not to be processed.</p>

<p>The next 2 lines show outfits that have been removed from the girl&#39;s wardrobes. Each line will contain a single integer, r (0 &lt;= r &lt;= n). A value of 0 means no outfit has been removed. Any other value means the girl has removed that numbered outfit (according to her numbering system) from her wardrobe. The first line will refer to Becs&#39; wardrobe, the second to Cas&#39;.</p>

<p>There then follow d lines, each representing the outfits chosen by each girl on a particular day, separated by a space with Becs&#39; choice first. For example:</p>

<p>3 12</p>

<p>means that Becs chose outfit 3 counting from the left of her wardrobe, Cas chose outfit 12 counting from the right of her wardrobe.&nbsp;</p>

### 출력

<p>Output will be a scenario number, followed by one line for each day in that scenario. Each day will have a day number followed by OK if the girls have chosen different outfits, ALERT if they have chosen the same one.</p>