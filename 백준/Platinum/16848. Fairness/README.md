# [Platinum III] Fairness - 16848

[문제 링크](https://www.acmicpc.net/problem/16848)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 8, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

브루트포스 알고리즘, 이분 매칭

### 문제 설명

<p>Anyone who has grown up with siblings knows that having siblings is a perfect way to develop an extremely acute sense of fairness. Almost every commodity &mdash; time with parents, time at the computer, access to the &ldquo;best&rdquo; chair at the dinner table &mdash; must be shared absolutely evenly, or else it is clear that your parents simply like your sibling much better than you. But probably the most frequent cause of arguments is favorite foods, in particular pizza slices. Things can sometimes get a little easier for the parents if the children have vastly different food preferences: you can safely give more pepperoni to the child who likes meat and more bell peppers to the child who prefers veggies. But sometimes, there is just no simple solution, for example, if all the toppings are in the same corner of the pizza pie.</p>

<p>We will consider a rectangular pizza of size X &times; Y . You will be given the coordinates at which the toppings sit: each will be a triple (x<sub>i</sub>, y<sub>i</sub>, t<sub>i</sub>), where t<sub>i</sub> denotes the type of topping at this location. For each of the T types of topping, you will be told how much each of the n children likes this type of topping. Your goal is to cut the pizza into n equal-shaped rectangles (other cuts are too complicated) and assign one rectangle to each child. In fact, the children are particularly fussy, so you cannot even rotate any of the rectanglar pieces: they must all have the same height and width. You cannot throw away any pizza &mdash; clearly, it&rsquo;s bad to waste food. Your goal is to make sure that each child likes his/her rectangle at least as much as he/she would like any of their siblings&rsquo; rectangles. It this is impossible, your program should say so.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains three integers and two doubles 1 &le; T &le; 100, 1 &le; n &le; 100, 1 &le; m &le; 1000 (the number of types of toppings, the number of children, and the number of toppings on this particular pizza), and 1.0 &le; X, Y &le; 100.0 (the dimensions of the pizza).</p>

<p>This is followed by n lines, each containing T integers pj,t &isin; [0, 10000], describing how much child j likes topping t.</p>

<p>Finally, there are m lines, each giving one topping on the pizza. Each such line has two doubles x<sub>i</sub>, y<sub>i</sub> with 0.0 &le; x<sub>i</sub> &le; X and 0.0 &le; y<sub>i</sub> &le; Y , giving the location of the i<sup>th</sup> topping; and one integer t<sub>i</sub> &isin; {1, . . . , T}, the type of topping. We promise that no topping will ever be in (or extremely close to) a location that you may need to cut through.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on one line, output the sum, over all chilcren, of the extent to which they like their own slice of pizza. If there are multiple ways of dividing the pizza such that for each of them, each child likes his/her own slice best, output the maximum sum possible over all such divisions. If it is impossible to divide the pizza such that each child prefers his/her own slice, output &ldquo;Impossible&rdquo; instead. Each data set should be followed by a blank line.</p>