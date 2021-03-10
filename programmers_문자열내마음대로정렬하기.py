'''
각문자열의 인덱스 (매개변수)n번째 글자를 기준으로 오름차순 정렬
'''
n = int(input())
list  = ["abce", "abcd", "cdx"]
list = sorted(list,key=lambda x:(x[n],x))
print(list)
