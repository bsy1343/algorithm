# [Bronze II] Oil Exploration - 5139

[문제 링크](https://www.acmicpc.net/problem/5139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 188, 정답: 135, 맞힌 사람: 122, 정답 비율: 70.520%

### 분류

구현, 문자열

### 문제 설명

<p>Before you can build oil rigs that will explode and cause huge oil spills, you first need to actually find some oil. Granted, the building and exploding part would theoretically work out without oil, but to produce an oil spill, you really do need oil. Being concerned mostly with costs and profits, the companies want to find oil they can extract as cheaply as possible. While there are other factors involved, a major component of price is how deep one needs to drill to find oil, and through what material. For this problem, we are ignoring just how large certain oil reservoirs are. You will be given a map of the seafloor, and asked to calculate the costs of drilling at the different points.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of each data set contains two integers 1 &le; h,w &le; 40. Those are the height and width of the seafloor map, respectively. This is followed by h lines, each a string of w upper-case characters. Each letter of the string will be either an &lsquo;X&rsquo; (indicating the presence of oil at that location), an &lsquo;H&rsquo; (indicating hard rock), or an &lsquo;S&rsquo; (indicating soft rock). Drilling through hard rock costs 3 per unit of rock, and drilling through soft rock costs 1 per unit. For each of the w positions, you are to compute how much it will cost to drill straight down from the top until the first oil is hit. In some positions, you might not hit any oil, in which case you should output the letter &lsquo;N&rsquo; instead of a cost.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the w costs for drilling to oil at the w positions, in left-to-right order, and separated by a single space each (with no space at the end of the line). If no oil is available at position w, output &lsquo;N&rsquo; for that position instead. Each data set should be followed by a blank line.</p>