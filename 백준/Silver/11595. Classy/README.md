# [Silver II] Classy - 11595

[문제 링크](https://www.acmicpc.net/problem/11595)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 81, 정답: 49, 맞힌 사람: 39, 정답 비율: 58.209%

### 분류

정렬, 문자열

### 문제 설명

<p>In his memoir So, Anyway. . . , comedian John Cleese writes of the class difference between his father (who was &ldquo;middle-middle-middle-lower-middle class&rdquo;) and his mother (who was &ldquo;upper-upperlower-middle class&rdquo;). These fine distinctions between classes tend to confuse American readers, so you are to write a program to sort a group of people by their classes to show the true distinctions.</p>

<p>There are three main classes: upper, middle, and lower. Obviously, upper class is the highest, and lower class is the lowest. But there can be distinctions within a class, so upper-upper is a higher class than middle-upper, which is higher than lower-upper. However, all of the upper classes (upper-upper, middle-upper, and lower-upper) are higher than any of the middle classes.</p>

<p>Within a class like middle-upper, there can be further distinctions as well, leading to classes like lower-middle-upper-middle-upper. When comparing classes, once you&rsquo;ve reached the lowest level of detail, you should assume that all further classes are the equivalent to the middle level of the previous level of detail. So upper class and middle-upper class are equivalent, as are middlemiddle-lower-middle and lower-middle.</p>

### 입력

<p>The first line of input contains n (1 &le; n &le; 1,000), the number of names to follow. Each of the following n lines contains the name of a person (a sequence of 1 or more lowercase letters &lsquo;z&rsquo;&ndash;&lsquo;z&rsquo;), a colon, a space, and then the class of the person. The class of the person will include one or more modifiers and then the word class. The colon, modifiers, and the word class will be separated from each other by single spaces. All modifiers are one of upper, middle, or lower. It is guaranteed that the input is well-formed. Additionally, no two people have the same name. Input lines are no longer than 256 characters.</p>

### 출력

<p>Print the n names, each on a single line, from highest to lowest class. If two people have equivalent classes, they should be listed in alphabetical order by name.</p>