# [Bronze II] Pea Soup and Pancakes - 17897

[문제 링크](https://www.acmicpc.net/problem/17897)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 239, 정답: 150, 맞힌 사람: 129, 정답 비율: 65.152%

### 분류

구현, 문자열

### 문제 설명

<p>As a Swede, you hold a deep love for the traditional Thursday lunch of pea soup and pancakes. You love it so much, in fact, that you will eat it any meal it is available. You find yourself looking at the menus for all your favorite restaurants every day to see if this combination is available, and realized you can do this more easily with a program. Given a list of restaurant menus, decide where to eat.</p>

### 입력

<p>The first line of input contains a number n (1 &le; n &le; 10), the number of restaurants. Then follow the n restaurant menus. Each menu starts with a line containing a number k (1 &le; k &le; 10), the number of menu items for the day. The remainder of the menu consists of k + 1 lines, each containing a nonempty string of at most 100 characters. The first of these lines is the restaurant name, and the rest are menu items. Strings consist only of lower case letters &lsquo;a&rsquo;-&lsquo;z&rsquo; and spaces, and they always start and end with a letter. All restaurant names are unique.</p>

### 출력

<p>Output a single line. If at least one restaurant has both &ldquo;pea soup&rdquo; and &ldquo;pancakes&rdquo; as menu items, output the name of the first of those restaurants, by the order in which the restaurants appear in the input. Otherwise, output &ldquo;Anywhere is fine I guess&rdquo;.</p>